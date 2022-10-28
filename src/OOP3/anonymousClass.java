package OOP3;

/**
 * the java anonymous class
 * these are nested classes without a name; it must be defined inside another class
 * type can be a superclass extension or an implementation of an interface
 * this makes code concise
 * created to perform specific tasks
 */

//extending a class
//class outerClass{
//    public void display(){
//        System.out.println("this is the outerClass");
//    }
//    public void createClass(){
//        //creating the anonymous class
//        outerClass p1 = new outerClass(){
//            @Override
//            public void display(){
//              System.out.println("This is the anonymous class");
//          }
//        };
//        p1.display();
//    }
//}
//implementing an interface
interface toBeImplemented{
  public void show();
    }
    class anonymous {
        public void createClass(){
        toBeImplemented ob1 = new toBeImplemented() {
            @Override
            public void show() {
                System.out.println("This is the anonymous class");
            }
        };
        ob1.show();
    }
}

public class anonymousClass {
    public static void main(String[] args) {
//        outerClass oC = new outerClass();
//        oC.createClass();
        anonymous ob = new anonymous();
        ob.createClass();
    }
}
