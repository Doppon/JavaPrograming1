class Test03B{
  public static void main(String[] args){
    Dog3 sakura = new Dog3("SAKURA");
    Dog3 momo = new Dog3("MOMO");
    sakura.numOfLegs = 10;

    System.out.println(momo.numOfLegs);
    System.out.println(Dog3.showNumLegs());
  }
}
