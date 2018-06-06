
public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator mr = new Calculator("C:\\Users\\masaomi\\Desktop\\source.txt");
		long start = System.nanoTime();
		mr.map(3);
		try {
			System.out.println("SUM:" + mr.getSum());
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");
	}

}
