package Bank_account;

import java.util.Scanner;

public class Bank_account {
    static int ac_n0;
    static String ac_holder_name;
    static int balance;


    public static int deposit(int amount, int presum){
        balance = amount+ presum;
        System.out.println("the deposited amount is"+ amount + " total balance is "+ balance);
        return balance;
    }
    public static void withdrawl(int amount, int presum){
        balance = presum - amount;
        System.out.println("withdrawl amount is "+ amount+ " available balance is "+ balance);

    }
    public static void currentBalance(){
        System.out.println(" available balance is "+ balance);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ac_n0=sc.nextInt();
        ac_holder_name=sc.nextLine();
        balance = deposit(3000, 2000);
        currentBalance();
        withdrawl(200,balance);
        currentBalance();

    }
}
