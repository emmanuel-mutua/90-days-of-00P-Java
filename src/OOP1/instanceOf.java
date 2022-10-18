package OOP1;

class Parent{
}
class child extends Parent {
    String num;


}
public class instanceOf {
    public static void main(String [] args){
child child = new child();
System.out.println(child instanceof Parent);
child.num = "emma";
System.out.println(child.num instanceof String);
    }
}
