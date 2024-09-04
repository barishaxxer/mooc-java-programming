
public class YourFirstBankTransfer {

    public static void main(String[] args) {
       Account matth = new Account("Matthews account", 1000);
       Account mine = new Account("My account", 0);
       matth.withdrawal(100);
       mine.deposit(100);
        System.out.println(matth);
        System.out.println(mine);
    }
}
