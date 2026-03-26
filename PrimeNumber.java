import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean flag = true;
        if (n <= 1) {
            flag = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println(n + "is a prime number");
        else
            System.out.println(n + "not prime number");
            sc.close();
    }

}
