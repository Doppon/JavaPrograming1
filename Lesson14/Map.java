import java.util.ArrayList;

public class Map extends Thread {
	ArrayList<Integer> al = new ArrayList<Integer>();
	int label = 0;
	int total = 0;
	Calculator cal;

	Map(Calculator cal) {
		this.cal = cal;
	}

	void assign(ArrayList<Integer> al, int i, int total) {
		this.al = al;
		this.label = i;
		this.total = total;
	}

	public void run() {
		long sum = 0;
		int len = this.al.size();
		long start = System.nanoTime();
		for (int j = this.label * len / this.total; j < (this.label + 1) * len / this.total; j++) {
			sum += this.al.get(j);

			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		cal.addSum(sum);
		long end = System.nanoTime();
		System.out.println("ThreadTime:" + (end - start) / 1000000f + "ms");
	}

}
