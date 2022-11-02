/**
 * Java enum(enumeration)= type that has fixed set of constant values
 * need to check the methods of the enum class ref  =  "https://www.programiz.com/java-programming/enums"
 */

package OOP3;
enum size{
    SMALL,MEDIUM,LARGE,EXLARGE;
    //Replaced:
//    public final static int SMALL = 1;
//    public final static int MEDIUM = 2;
//    public final static int LARGE = 3;
//    public final static int EXTRALARGE = 4;


    //    public String orderCloth(){
//        switch (this){
//            case SMALL: System.out.println("Ordered small cloth");
//                break;
//            case MEDIUM:
//                System.out.println("Ordered medium cloth");
//                break;
//            case LARGE:
//                System.out.println("Ordered large cloth");
//                break;
//            case EXLARGE:
//                System.out.println("Ordered ex_large cloth");
//                break;
//            default:
//                System.out.println("Confused");
//        }
//        return null;
//    }
    public String getSize(){
        switch (this){
            case SMALL: return "small";
            case MEDIUM: return "medium";
            case LARGE: return "lARGE";
            default: return null;
        }
    }

}
//class order{
//    size clothSize;
//    public order(size clothSize){
//        this.clothSize = clothSize;
//    }

//}


public class enums {
    public static void main(String[] args)
    {
        System.out.println("Size of the cloth: " + size.LARGE.getSize());
    }
}
