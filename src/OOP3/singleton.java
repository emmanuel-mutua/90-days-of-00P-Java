/**
 * design pattern that ensures that a class can only have one object
 * singletons used in logins and databases
 * design pattern is like a library including various coding techniques
 */
package OOP3;

class login{

    private static login dbobject;
    //creating a constructor == restrict the creation of an object outside the class
    private login(){}
    //creating a login if not created
   //public static ensures that we can access the object created
     public static login getInstance(){
        if (dbobject == null){
            dbobject = new login();
        }
        return dbobject;
    }
    public void newConnection(){
        System.out.println("new db created");
    }
}

public class singleton {
    public static void main(String[] args) {
        login db1;
        //create a new db if not created
        db1 = login.getInstance();
        db1.newConnection();

    }
}
