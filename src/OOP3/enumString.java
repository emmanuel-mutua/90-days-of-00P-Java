package OOP3;

enum theSize{
    theSmall{
        public String toString(){
            return "The size is small";
        }
    },
    theLarge{
        public String toString(){
            return "the size is large";
        }
    }
}
enum sz{
    theSmall,theLarge;

}

public class enumString {
    public static void main(String[] args) {
        theSize ob = theSize.theSmall;
        System.out.println(ob.toString());

        System.out.println("the size: " + sz.theSmall.toString());
    }
}
