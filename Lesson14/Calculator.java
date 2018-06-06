import java.io.*;
import java.util.*;

class Calculator{
    ArrayList<Integer> as = new ArrayList<Integer>();
    ArrayList<Map> mp = new ArrayList<Map>();
    long sum = 0;

    Calculator(String fileName){
		BufferedReader br = null;
		String line = "";
		try{
			FileInputStream fi = new FileInputStream(fileName);
			InputStreamReader is = new InputStreamReader(fi,"UTF-8");
			br = new BufferedReader(is);
			while((line = br.readLine())!=null){
				as.add(Integer.parseInt(line));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
    }

    void map(int n){
		for(int i=0;i<n;i++){
			Map m = new Map(this);
			m.assign(as,i,n);
			mp.add(m);
			m.start();
		}
    }
    
    void addSum(long sum){
		this.sum += sum;
    }
    
    long getSum(){
		try{
			for(Map a : mp){
				a.join();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	return sum;
    }
}
