package OOP1;
import java.util.Scanner;

import static OOP1.Factorial.factorial;

class Factorial{
    public static int factorial(int n){
        if(n !=0) //termination condition
            return n*factorial(n-1);
        else
            return 1;
    }
}
public class recursion {

    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        //Factorial obj = new Factorial();
        while (true) {
            System.out.println("Enter the number to check the factorial");
            int num = in.nextInt();
            int result;
            result = factorial(num);
            System.out.println(num + " factorial = " + result);
        }
    }
}
//recursive method is a method that calls itself and the process is called recursiom