package OOP2;
//you cannot define a parent class as final
class parent {
    protected String name;
    public void displayName(){
        this.name = "Parent class";
        System.out.println(name);
    }
}
 class child extends parent{
    @Override
//    the override specifies that the method overrides the method in the superclass
//    it provides a different implementation of a method already defined in the parent class
//    it is used when the child method has the same name with the parent class
//    to provide a specific implementation of a method already done in the parent class
    public void displayName(){
        this.name = "Child class";
        System.out.println(name);
    }
}
public class method_overriding {
    public static void main(String[]args){
        child ob = new child();
        ob.displayName();
    }

}
