public class Calculator {
String brand;
String model;
int cost;
    void sum(){
       int a=10;
       int b=20;
        System.out.println("addition of "+(a+b));

   }
   void sub(){
    int p=20;
    int q=30;
    System.out.println("subtraction of"+(p-q));
   }
   void mul(){
    int x=20;
    int y=30;
    System.out.println("multiplication of "+(x*y));

   }
   public static void main(String[] args) {
    Calculator c1= new Calculator();
    c1.sum();
    c1.sub();
    c1.mul();
    System.out.println(c1.cost);
    System.out.println(c1.brand);
    
   }
}
