import java.util.List;
// 並行に動作する計算ノード
public class CalcNode extends Thread {
    List<Integer> dataList;
    int myId;
    int numNodes;
    Calculator calc;
    CalcNode(Calculator calc) {
        this.calc = calc;
    }
    void assign(List<Integer> list, int i, int n) {
        this.dataList = list;
        this.myId = i;
        this.numNodes = n;
    }
    public void run() {
        long sum = 0;
        int numData = this.dataList.size();
        long start = System.nanoTime();
        // このノードの担当範囲の加算を実行
        for (int i = this.myId * numData / this.numNodes; i < (this.myId + 1) * numData / this.numNodes; i++) {
            sum += this.dataList.get(i);
        try {
            Thread.sleep(1); // 計算コストの代わり
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    calc.addSum(sum); // 計算結果を全体のsumに加える
    long end = System.nanoTime();
    System.out.println("ThreadTime:" + (end - start) / 1000000f + "ms");
    }
}
