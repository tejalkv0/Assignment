import java.util.Scanner;

public class SalaryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name;
        int age;
        float salary; 

        System.out.println("enter name");
        Name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter salary");
        salary = sc.nextFloat();
        if (age >= 21 && salary >= 2100) {
            System.out.println("Loan granted " + Name);
        } else {
            System.out.println("Not granted " + Name);
        }
    }

}
