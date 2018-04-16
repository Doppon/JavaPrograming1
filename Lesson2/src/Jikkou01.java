class Jikkou01 {
    public static void main(String[] args) {
        Saifu mySaifu = new Saifu();
        mySaifu.setOkane(mySaifu.getOkane() + 5000);
        System.out.println("okane = " + mySaifu.getOkane());
    }
}
