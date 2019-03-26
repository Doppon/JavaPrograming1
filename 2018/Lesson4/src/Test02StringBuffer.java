class Test02B {
  public static void main(String[] args) {
    // ゴリ押しの処理
    String str = "AAA";
    for(int i = 0; i < 50000; i++) {
      str = str + "BCDEF";
    }
    System.out.println("end_string");
    
    // StringBefferを用いた処理
    StringBuffer strBuff = new StringBuffer("AAA");
    for(int i = 0; i < 50000; i++) {
      strBuff.append("BCDEF");
    }
    String str_buff = strBuff.toString();
    System.out.println("end_string_buffer");
  }
}
