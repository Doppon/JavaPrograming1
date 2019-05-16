class Test05C {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for(int j=0; j<10; j++) {
            intArray[j] = (int)(Math.random() * 10) + 1;
            System.out.println(intArray[j]);
        }
    }
}
