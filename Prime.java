import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter starting number");
        int start=sc.nextInt();
        System.out.print("enter end number");
        int end =sc.nextInt();
        for(int i=start;i<=end;i++){
            boolean flag = true;
         if (i<= 1) {
            flag = false;
        }
        else 
        {
             for(int j = 2; j <= Math.sqrt(i); j++)
              {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
         }
          }
          if (flag){
            System.out.print(i+" ");

          }
        }
         sc.close();
          }
        }
            
        
    
