package OOP3;

enum Size{
    small("The size is small"),
    medium("The size is medium"),
    large("The size is large");
    private final String pizzaSize;
    Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public String size(){
        return pizzaSize;
    }
}
enum registrationNumber{
    abc("Student 1"),
    bcd("Student 2"),
    xyz("Student 3");

    public String regNo;
    registrationNumber(String regNo){
        this.regNo = regNo;
    }
    public String getStudNo(){
        return regNo;
    }
}
class MainClass{
    public static void main(String[] args) {
        //pizza object
        Size pizza = Size.small;
        System.out.println(pizza.size());

        //regNo object
        registrationNumber rgNo = registrationNumber.xyz;
        System.out.println("Student registration number is : " + rgNo.getStudNo());
    }
}
