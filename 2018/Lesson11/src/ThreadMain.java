class ThreadMain {
    public static void main(String[] args) {
        ThreadSmpl shoriB = new ThreadSmpl();
        shoriB.start();
        for (int i=0; i<3; i++) {
            System.out.println("A:" + i);
        }
        System.out.println("Main is ended.");
    }
}
