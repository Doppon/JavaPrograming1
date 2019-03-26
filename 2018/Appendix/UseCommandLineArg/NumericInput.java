class NumericInput {
  public static void main(String args[]) {
    int price = Integer.parseInt(args[0]);
    System.out.println("あなたの購入した商品は税込で" + price * 1.08 + "円です！");
  }
}
