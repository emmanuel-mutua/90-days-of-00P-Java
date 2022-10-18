package OOP2;
//you cannot define a parent class as final
abstract class par {
    protected String name = "parent class";

    public void displayNam() {

    }

    public void showName() {

    }

}
 class child extends par{
    @Override
//    the override specifies that the method overrides the method in the superclass
//    it provides a different implementation of a method already defined in the parent class
//    it is used when the child method has the same name with the parent class
//    to provide a specific implementation of a method already done in the parent class
    public void displayNam(){
        this.name = "Child class";
        System.out.println(name);
        System.out.println("Child class is inherited from the " + super.name);
    }
    @Override
    public void showName(){
        System.out.println("I am the " + name);
        System.out.println("I have been inherited from the " + super.name );
    }
}
public class method_overriding {
    public static void main(String[]args){
        child ob = new child();
        ob.showName();
    }

}
