package OOP2;

/**
 * encapsulation == it is the bundling of related fields AND methods of a class.
 * it helps to achieve data hiding but only when private keyword is used
 */
class Area{
    private int length;
    private int width;

     Area(int length,int width){
            this.length = length;
            this.width = width;
    }
    public void getArea(){
         int area = length*width;
         System.out.println(area);
    }

    /**
     * data hiding
     */

    }

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }
}
public class encapsulation {
    public static void main(String[]args){
//    Area rect = new Area(10,5);
//    rect.getArea();
         Person per = new Person();
         per.setAge(24);
         per.getAge();
    }
}
