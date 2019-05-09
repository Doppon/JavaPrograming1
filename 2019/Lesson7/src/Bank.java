class Bank {
    public static void main(String[] args) {
        System.out.println("hoge");
    }
}


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


class ChokinBako {
    int okane = 0;
    boolean available = true;

    void addOkane(int i) {
        okane += 1;
    }

    void print() {
        System.out.println(bank + okane + "yen");
    }

    boolean getAvailability() {
        return available;
    }
}
