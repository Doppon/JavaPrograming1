import java.io.*;
class Test05B {
    public static void main(String[] args) {
        BufferedReader bf = null;
        String strData = "";
        try{ 
            FileInputStream fI = new FileInputStream("Sample.txt");
            InputStreamReader iS = new InputStreamReader(fI,"SJIS");
            bf=new BufferedReader(iS);
            while((strData=bf.readLine())!=null) {
                System.out.println(strData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("ファイルがありません。");
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
