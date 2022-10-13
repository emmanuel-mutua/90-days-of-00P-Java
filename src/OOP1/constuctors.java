package OOP1;
class Company{
     boolean result;
    String name;
    String option;
    public Company(){
         name = "Guava";
         option = "Maembe";
         result = name.equals(option);
    }
}
public class constuctors {
    //constructor overloading and the use of this keyword
    String name;
    constuctors(){
        this.name = "Constructor 1";
    }
    constuctors(String name){
        this.name = name;
    }

    public void getName() {
        System.out.println("\n" + "Name is: " + this.name);
    }

    public static void main(String[]args){
        Company co = new Company();
        //checking is maembe is the name of Guava Company
        System.out.println(co.result);

        //accessing the overloaded constructors
        constuctors obj1 = new constuctors();
        constuctors obj2 = new constuctors(" constructor2");

        obj1.getName();
        obj2.getName();

    }
}
