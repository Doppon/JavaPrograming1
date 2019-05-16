class Warizan {
    int a = 0;
    int b = 0;
    void setA(int a) {
        this.a = a;
    }
    void setB(int b) {
        this.b = b;
    }
    int div() {
        try {
            int r = this.a / this.b;
            return r;
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero.");
            return 0;
        }
    }
}
