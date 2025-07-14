package Syntax;

class BankAccount{
    private double balance;

    public BankAccount(double balance ){
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception{
        if(amount > balance ){
            throw new Exception ("Insufficient Balance");

        }
        balance -= amount;
        System.out.println("Withdraw: "+ amount );
    }
    public double getBalance(){
        return balance;
    }
    static void displayBalance(){
        System.out.println("my balance balance is  1000");
    }
}

public class day2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        try{
            acc.withdraw(1200);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage() );
        }
        finally {
            System.out.println("Finale Balance : "+ acc.getBalance());
        }
        BankAccount.displayBalance();

    }
}
