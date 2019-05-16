class Test05C {
    public static void main(String[] args) {
        try {
            int count = Integer.parseInt(args[0]);
            int[] intArray = new int[count];
    
            for(int j=0; j<intArray.length; j++) {
                intArray[j] = (int)(Math.random() * 10) + 1;
                System.out.println(intArray[j]);
            }
        } catch (NumberFormatException e) {
            System.out.println("数字以外の文字が入力されました");
        }
    }
}
