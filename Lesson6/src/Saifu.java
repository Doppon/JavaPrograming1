import java.io.*;

class MainSaifu {
  public static void main(String[] args){
    Saifu a = new Saifu();
    a.okane=100;
    Saifu b = a;
    b.okane=50;
    System.out.println("aのお金:"+a.okane);
  }
}

class Saifu{
  public int okane = 0;
  private int zandaka = 10000;
  public void useCard(int i){
    zandaka = zandaka - i;
  }
  public void useCard(int i, double rishi){
    zandaka = zandaka - (int)(i*rishi);
  }
  public int showZandaka(){
    return zandaka;
  }
}
