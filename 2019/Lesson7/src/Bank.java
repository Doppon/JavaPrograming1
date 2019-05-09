public class Bank {


    private static class BankAccount {
        int okane = 0;
        /*
        [src] $javac Bank.java 
        Bank.java:27: エラー: シンボルを見つけられません
        System.out.println(bank + okane + "yen");
                        ^
        シンボル:   変数 bank
        場所: クラス ChokinBako
        エラー1個
        */
        String bank = "TokyoBank";
    
        void addOkane(int i) {
            okane += 1;
        }
    
        void print() {
            System.out.println(bank + okane + "yen");
        }
    }
    
    
    private static class ChokinBako {
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
    

    public static void main(String[] args) {
        System.out.println("hoge");
    }
}


