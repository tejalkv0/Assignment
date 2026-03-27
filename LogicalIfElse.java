import java.util.Scanner;

public class LogicalIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("enter the marks");
        marks=sc.nextInt();
        if(marks>=85 && marks>=90){
            System.out.println("A grade");
        }
        else if (marks >= 70 && marks >=65) 
        {
            System.out.println("B grade");
        }  else {
            System.out.println("Fail");

        }
        sc.close();
    }
}
