package exception;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 20:05
 */
public class Account {
    protected double balance;
    public Account(double balance){
        this.balance=balance;
    }
    //获取余额
    public double getBalance() {
        return balance;
    }
    //存钱
    public void deposit(double m){
        balance=balance+m;
    }
    //取钱
    public void withdraw(double q)throws OverdraftException{
        if(this.balance<q)
            throw new OverdraftException("你要取的钱超过了你的额度",q-this.balance);
    }


    class  OverdraftException extends Exception{
        private double deficit;
        public OverdraftException(String message,double deficit){
            super(message);
            this.deficit=deficit;
        }
        public double getDeficit(){
            return deficit;
        }
    }

     static class CheckingAccount extends Account{
        private double overdraftProtection;
        public CheckingAccount(double balance){
            super(balance);
        }
        public CheckingAccount(double balance,double overdraftProtection){
            super(balance);
            this.overdraftProtection=overdraftProtection;
        }

        @Override
        public void withdraw(double q) throws OverdraftException {
            if(this.balance+overdraftProtection<q){
                throw new OverdraftException("你要取的钱超过额度",q-balance);
            }
            balance=balance-q;
        }
    }
    public static void main(String[] args) {
        Account a=new Account(8000);
        System.out.println("当前余额为："+a.getBalance());
        a.deposit(500);
        System.out.println("存钱之后的余额为："+a.getBalance());
        try{
            a.withdraw(9000);
        }catch (OverdraftException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("透支金额为："+e.getDeficit());
        }
        CheckingAccount c=new CheckingAccount(10000,2000);
        c.deposit(1000);
        System.out.println(c.getBalance());
        try{
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            c.withdraw(2000);
            System.out.println(c.getBalance());
        }catch (OverdraftException e){
            System.out.println("透支额度"+e.getDeficit());
            e.printStackTrace();
        }
    }

}
