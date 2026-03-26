
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        age = sc.nextInt();
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("eligible to vote and eligible for govt fund");
            } else
                System.out.println("eligible to vote but not eligible for govt fund");

        } else
            System.out.println("not eligible to vote and not eligible for govt fund");
        sc.close();

    }

}
