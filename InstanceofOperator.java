class Animal{

}


public class InstanceofOperator {
    public static void main(String[] args) {
        Animal an=new Animal();
        Animal as=new Animal();
        Animal tg=new Animal();
        Tiger tg=new Tiger();//error because it doesnt belong to animal class
        System.out.println(an instanceof Animal);
        System.out.println(as instanceof Animal);
        System.out.println(tg instanceof Animal);
    }
}
