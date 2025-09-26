package classes;

public class BankAccountTest2 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setAno("11-22-3333");
        account1.setOwner("홍길동");
        account1.setBalance(1000);

        account2.setAno("22-33-4444");
        account2.setOwner("이순신");
        account2.setBalance(2000);

        accounts[0] = account1;
        accounts[1] = account2;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                System.out.println("계좌번호: " + accounts[i].getAno());
                System.out.println("예금주: " + accounts[i].getOwner());
                System.out.println("잔고: " + accounts[i].getBalance());
                System.out.println();
            }
        }
    }
}
