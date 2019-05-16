class Test05C {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int[] intArray = new int[count];

        for(int j=0; j<intArray.length; j++) {
            intArray[j] = (int)(Math.random() * 10) + 1;
            System.out.println(intArray[j]);
        }
    }
}
