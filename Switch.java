import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day");
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("invalid day");
        }
        sc.close();
    }
}
