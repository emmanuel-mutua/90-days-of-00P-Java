package OOP2;


class Parent{
    String nam;
    public void display(){
        System.out.println("This is the parent class");
    }
}
class Child extends Parent {
    public void display(){
        System.out.println("This is the child class, it is inherited from the " + nam);
    }
}

public class Inheritance {
    public static void main (String[]args){
        Child emm = new Child();
        Parent par = new Parent();
        emm.nam ="parent class";
        emm.display();
//        checking whether a class is an instance of the other class
        System.out.println(emm instanceof Child);
        System.out.println(emm instanceof Parent);
    }
}
/**
 * Inheritance is used when there is a relationship between the two classes
 *
 */
