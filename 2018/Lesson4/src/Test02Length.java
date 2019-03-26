class Test02Length {
  public static void main(String args[]) {
    String message = "";
    for(int i=0; i<3; i++) {
      message += args[i] + " ";
    }
    message += args[3] + ".";
    System.out.println(message);
  }
}
