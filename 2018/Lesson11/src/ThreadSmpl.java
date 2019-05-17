class ThreadSmpl extends Thread {
    public void run() {
        for (int i=0; i<3; i++) {
            System.out.println("B:" + i);
        }
    }
}
