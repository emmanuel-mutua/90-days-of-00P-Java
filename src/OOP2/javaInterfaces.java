package OOP2;

/**
 * interface in java helps to acheive abstraction in java
 */
interface quantrantArea{
    public void getArea(int length, int width);
}
interface quantrantPeri extends quantrantArea{
    public void getPerimeter(int length, int width);
}

//implementing two interfaces
class rectangle implements quantrantArea,quantrantPeri {
    @Override
    public void getArea(int length, int width) {
        System.out.println("the area : " + (length*width));
    }

    @Override
    public void getPerimeter(int length, int width) {
        System.out.println("the perimeter : " + 2*(length+width));
    }
}
public class javaInterfaces {
    public static void main (String [] args){
        rectangle rA = new rectangle();
        rA.getArea(5,5);
        rA.getPerimeter(5,5);
    }
}
