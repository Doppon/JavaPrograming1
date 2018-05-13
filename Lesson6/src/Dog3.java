class Dog3 {
  Dog3(){
    // 引数なしのコンストラクタ
  }

  Dog3(String s){
    // Stringクラスのオブジェクトsを引数に
    // 持つコンストラクタ
  }
  
  String name="HACHI";
  void setName(String s){
    name = s;
  }
  String whoami(){
    return name;
  }

  static int numOfLegs = 4;
  
}
