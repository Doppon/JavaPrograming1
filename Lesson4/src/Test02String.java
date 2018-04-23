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
    System.out.println("文字列の長さ：" + akita.name.length());
  }
}
