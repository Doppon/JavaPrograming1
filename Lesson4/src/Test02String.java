class Dog {
  String name = "HACHI";
  void setName(String s) {
    name = s;
  }
  String getName() {
    return name;
  }
}

class Test02A {
  public static void main(String[] args) {
    Dog akita = new Dog();
    akita.setName("HACHI-KOU");
    akita.getName();

    // 文字列の長さの出力
    System.out.println("文字列の長さ：" + akita.name.length());

    // 小文字にして出力
    System.out.println(akita.name.toLowerCase());

    // HA -> PO
    System.out.println(akita.name.replace("HA","PO"));

    // ハイフンより前を出力
    String[] array = akita.name.split("-");
    System.out.println(array[0]);    
  }
}
