package study._super.exer;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount cacc = new CheckAccount(1122,20000,0.045,5000);
        cacc.withdraw(5000);
        System.out.println("账户余额："+cacc.getBalance());
        System.out.println("可透支额度："+cacc.getOverdraft());
        cacc.withdraw(18000);
        System.out.println("账户余额："+cacc.getBalance());
        System.out.println("可透支额度："+cacc.getOverdraft());
        cacc.withdraw(3000);
        System.out.println("账户余额："+cacc.getBalance());
        System.out.println("可透支额度："+cacc.getOverdraft());
    }
}
