import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int units;
        double bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter units");
        units = sc.nextInt();
        if (units <= 150) {
            System.out.println("bill" + (1.5 * units));
        } else {
            System.out.println("bill" + (3 * units));
        }
        sc.close();
    } 
}
