class Test03A{
  public static void main(String[] args) {
    Dog3 john = new Dog3();
    Dog3 pochi = new Dog3("POCHI"); 
    john = pochi;
    System.out.println(john.whoami());
  }
}
