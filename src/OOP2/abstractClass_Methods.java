package OOP2;//package OOP2;
// abstract class abstrac{
//     abstract void display();
//     String neme;
//     abstrac (){
//         this.neme = "abstract object";
//         System.out.println(neme);
//     }
// }
// class abstractClass_Methods extends abstrac{
//     public void display(){
//         System.out.println("This is implementation of the abstract method");
//     }
// }
// abstract class bycycle{
//    abstract public void show();
// }
// class mountainBicycle extends bycycle{
//
//     @Override
//     public void show() {
//         System.out.println("This is the mountain byke");
//     }
// }
// class sportsByke{
//    public void show(){
//        System.out.println("This is the sports byke");
//    }
// }
// class main {
//
//     public static void main(String[] args) {
////        we cannot instanciate an object to an abstract class
//         //  abstrac obj = new abstrac()
//
//         sportsByke sb = new sportsByke();
//         sb.show();
//         mountainBicycle mb = new mountainBicycle();
//         mb.show();
////         abstractClass_Methods obj = new abstractClass_Methods();
////         obj.display();
//     }
// }



abstract class absenteesm{
    abstract void showMembers();
    abstract void showTime();
    abstract void showFuture();
}
 class students extends absenteesm{
    @Override
    public void showMembers() {
        System.out.println("Me, you , him");
    }

    @Override
   public void showTime() {
        System.out.println("9,10,11");
    }

    @Override
    public void showFuture() {
        System.out.println("No occurrence");
    }
}
class main{
    public static void main(String[] args) {
        students ob = new students();
        ob.showMembers();
        ob.showTime();
        ob.showFuture();
    }
}


/**
 * Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.
 * for example we know that when we apply brakes a moto stops, however the working of the brakes os hidden -- the manf can impliment the working diffrently thou the working is the same
 *tip of the day
 * MICROVERSE == this is a global school for remote software developers access education free of charge
 */