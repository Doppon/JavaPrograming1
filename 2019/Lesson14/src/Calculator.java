import java.io.*;
import java.util.*;

class Calculator{
    ArrayList<Integer> dataList = new ArrayList<Integer>();
    ArrayList<CalcNode> nodeList = new ArrayList<CalcNode>();
    long sum;

    BufferedReader bf = null;
    String fileName ="";
    Calculator(String fileName) {
        try {
            FileInputStream fI = new FileInputStream(fileName);
            InputStreamReader iS = new InputStreamReader(fI,"SJIS");
            BufferedReader bf = new BufferedReader(iS);
            while((fileName = bf.readLine()) != null)
            dataList.add(Integer.parseInt(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                bf.close();
            } catch(Exception e) {
                e.printStackTrace();
            }	    
        }
    }

    void createNodes(int n) {
        for(int i=0; i<n; i++) {
            CalcNode node = new CalcNode(this);
            node.assign(dataList, i, n);
            nodeList.add(node);
            node.start();
        }
    }

    synchronized void addSum(long sum){
        this.sum += sum;
    }
    
    long getSum() {
        try {
            for(int j=0; j<nodeList.size(); j++) {
                nodeList.get(j).join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return sum;
        }
    }
}
