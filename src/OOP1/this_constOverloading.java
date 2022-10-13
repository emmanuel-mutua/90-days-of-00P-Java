
package OOP1;

class Complex{
    private int a,b;
    //        constructor with 2 parameters
    Complex(int i , int j){
        this.a=i;
        this.b = j;
    }
    //        constructor with single parameter
    Complex(int i){
//            this invokes the constrctor with two arguments
        this(i,i);
    }
//    constructor with no parameter
            Complex(){
        //invoke the constructor with no parameter
                this(0);
        }
        @Override
    public String toString(){
        return this.a + "+" + this.b + "i";
        }

}
//passing this as an argument
class ThisExample{
    int x,y;
    ThisExample(int x,int y){
        this.x= x; //1
        this.y = y;//-2
        System.out.println("Before passing this to add two numbers\n");
        System.out.println("x = " + this.x + ", y = " + this.y);
//        call the add() method passing this as an argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
    void add(ThisExample o){
        o.x += 2; //3
        o.y += 2; //0
    }
}

public class this_constOverloading {

    public static void main (String[]args){
        ThisExample obj = new ThisExample(1,-2);
        System.out.println("dhd");
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();

        //printing the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
