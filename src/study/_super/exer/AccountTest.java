package study._super.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(1122,20000,0.045);
        acct.withdraw(30000);
        System.out.println("您的账号余额为："+acct.getBalance());
        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("您的账号余额为："+acct.getBalance());
        System.out.println("月利率为："+acct.getMothlyInterest());
    }
}
