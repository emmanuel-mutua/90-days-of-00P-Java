package javaExamples;
/**
 * ascii value
 */

import java.util.List;
import java.util.Scanner;

class q1 {
    public void q1() {
        System.out.println("Enter Number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("You Entered: " + number);
    }
}

class ascii {
    public void ascii() {
        char ch = 'a';
        int ascii = ch;

        int castascii = (int) ch;
        System.out.println(ascii);
        //excplain type casting amd why the output of this code is 97
    }
}

//java program to compute the quotient and the remainder
class cal {
    /**
     * 10/3 = q = ans remainder = deno
     */
    int num = 20;
    int devider = 3;
    int devided = num / devider;
    int rem = num % devided;

}
class vowels{
void check() {
    char vowel = 'a';
    switch (vowel) {
        case 'a' | 'A':
        case 'e' | 'E':
        case 'i' | 'I':
        case 'o' | 'O':
        case 'u' | 'U':
            System.out.println("It is a vowel");
            break;
        default:
            System.out.println("It is a alphabet");
    }
}

}

public class simple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = List.of(22,33,44);
        int max = numbers.get(0);
        for (int x:numbers) {
            if (numbers.get(x) > max){
                max = numbers.get(x);
            }
        }
        System.out.println(max);
    }
}
