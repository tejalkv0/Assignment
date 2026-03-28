public class Phone {
    String brand="apple";
    String model="17 pro";
    void call(){
        System.out.println("17 pro calling from "+ this . brand);
        
        }
        void msg(){
            System.out.println("msg pinged from "+ this.model);
        }
        void video(){
            System.out.println("video live");
        }
        public static void main(String[] args) {
            Phone p1=new Phone();
            Phone p2=new Phone();
            Phone p3=new Phone();
           
            p1.call();
            p2.msg();
            p3.video();

        }
    }
    

