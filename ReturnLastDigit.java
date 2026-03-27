import java.util.Scanner;

public class ReturnLastDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        //int lastDigit=num%10;
        int firstDigit=num/10;
       
        System.out.println("firstDigit is:"+firstDigit);
    }
    
}
