class Test02B {
  public static void main(String[] args) {
    StringBuffer strBuff = new StringBuffer("AAA");
    for(int i = 0; i < 100000; i++) {
      strBuff.append("BCDEF");
    }
    String str = strBuff.toString();
    System.out.println("end");
  }
}
