class Account{
  public int amt = 1000;
  public void save(int j){
    amt = amt + j;
  }
  public int show(){
    return amt;
  }
}

class SampleClass02{
  public static void main(String[] args){
    Account myAccount = new Account();
    myAccount.save(2000);
    int j = myAccount.show();
    System.out.println("預金："+j);
  }
}
