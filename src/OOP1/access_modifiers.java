package OOP1;

class access_modifiers {
    //default modifier
    class Logger {
        void message(){
            System.out.println("This is a message");
        }
    }
    private static class School{
        private String name00;
        private School(){
             name00 = new String("Dedan kimathi");
        }
    }
    class Company{
        String name11;
        public Company(){
            name11 = new String("Dekut Enterprises");
        }
    }
    class Field{
        String name22;
        public Field(){
            name22 = new String("Computing");
        }
    }
    public static void main(String []args){
        School nm = new School();
        System.out.println(nm.name00);
    }
}


/* NOTES
There are four access modifiers in Java
namely: Default = declarations are visible within the package(package private)
        Private = declarations are visible to the class only
        Protected = declarations are visible within the package or small subclasses
        Public = declarations are visible everywhere
 use the getter and setter methods to access the private declarations

 class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Main {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Emmanuel");
        System.out.println(d.getName());
    }
}
// the protected access modifier
class Student {
    // protected method
     protected void display() {
        System.out.println("I am an student");
    }

}

class Students extends Student {
    public static void main(String[] args) {

        // create an object of Dog class
        Students stud = new Students();
         // access protected method
        stud.display();
    }
}

 */