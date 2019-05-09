class BankAccount {
    int okane = 0;
    String bank = "TokyoBank";

    void addOkane(int i) {
        okane += 1;
    }

    void print() {
        System.out.println(bank + okane + "yen");
    }
}
