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
    public static void main(String[]args){
        Company co = new Company();
        //checking is maembe is the name of Guava Company
        System.out.println(co.result);

    }
}
