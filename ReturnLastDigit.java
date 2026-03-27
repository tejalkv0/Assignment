import java.util.Scanner;

public class ReturnLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        // int lastDigit=num%10;

        while (num >= 10) {

            num = num / 10;

        }
        System.out.println("first digit:" + num);

    }

}
