public class Human {
  String name;
  int birthday;
  int manpukudo;

  Human(){
    this.name = "hogemaru";
    this.birthday = 19990909;
    this.manpukudo = 50;
  }

  void eat() {
    this.manpukudo += 60;
  }
}
