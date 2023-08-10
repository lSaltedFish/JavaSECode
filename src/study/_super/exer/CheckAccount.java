package study._super.exer;

public class CheckAccount extends Account{
    private double overdraft;//可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 可透支账号取钱操作
     * @param amount 要取出的金额
     */
    public void withdraw(double amount){
        if (amount<=getBalance()){
            super.withdraw(amount);
        }else if (amount<=getBalance()+overdraft){
            overdraft -=amount-getBalance();
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支限额！");
        }
    }
}
