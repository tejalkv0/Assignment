import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double deposit,amount;
        String name;
        System.out.println("enter name");
        name=sc.nextLine();
       
        System.out.println("enter amt for deposit");
        amount=sc.nextDouble();
        deposit(amount);
    }
       public static void deposit(double amount) 
        
       {
        double balance = 2000;
        balance = balance + amount;
        System.out.println("balance after deposit "+balance);
        }
    
}
