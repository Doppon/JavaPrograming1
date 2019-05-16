class Test05A {
    public static void main(String[] args) {
        Warizan w = new Warizan();
        w.setA(10);
        w.setB(3);
        /*
        w.setB(3); -> w.setB(0);

        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Warizan.div(Warizan.java:11)
        at Test05A.main(Test05A.java:6)
        */
        int result = w.div();
        System.out.println("result=" + result);
    }
}
