// exeption heandling 
import java.util.Scanner;
import javax.management.monitor.MonitorSettingException;

class MoneyisnotenoughExeption extends Exception {

    MoneyisnotenoughExeption(String msg) {
        super(msg);
    }
}

class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        double old_balance = this.balance;
        this.balance += amount;

        System.out.println("old balance:" + old_balance);
        System.out.println("new balance:" + balance);
    }

    public void withdrow(double amount) throws ArithmeticException,MoneyisnotenoughExeption {
       
        if (amount > balance) {
            throw new ArithmeticException("Balance is not enough");
        }
        double old_balance = this.balance;
        this.balance -= amount;

        if (balance < 500) {
            this.balance = old_balance;
               throw new MoneyisnotenoughExeption("minimum balance should be 500rs");
        }
        System.out.println("old balance: "+old_balance);
        System.out.println("new balance:"+balance);
    }
}

class demo {
    public static void main(String[] args) {
      Bank myBank = new Bank(2000);

      myBank.deposit(500);
try{
      myBank.withdrow(1200);
      myBank.withdrow(1200);
    
    }
 catch (ArithmeticException e) {
       System.out.println(e.getMessage());
    }
    catch(MoneyisnotenoughExeption e){
        System.out.println(e.getMessage());
    }

}
}