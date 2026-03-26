import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("enter marks");
        marks = sc.nextInt();
        if (marks >= 85) {
            System.out.println("A grade");
        } else if (marks >= 70) {
            System.out.println("B grade");
        } else if (marks >= 65) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");

        }
        sc.close();
    }

}
