package OOP2;

class Parent{
    String name;
    public void display(){
        System.out.println("This is the parent class");
    }
}
class Child extends parent {
    public void display(){
        System.out.println("This is the child class, it is inherited from the " + name);
    }
}

public class Inheritance {
    public static void main (String[]args){
        Child emm = new Child();
        parent par = new parent();
        emm.name ="parent class";
        emm.display();
//        checking whether a class is an instance of the other class
        System.out.println(emm instanceof Child);
        System.out.println(emm instanceof parent);
    }
}
/**
 * Inheritance is used when there is a relationship between the two classes
 *
 */
