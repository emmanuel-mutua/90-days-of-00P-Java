/**
 * the purpose of polymorphism is to ensure consistency in code
 * polymorphism means that the same method can have different implementations
 * A variable is called polymorphic if it refers to different values under different conditions.
 *operator overloading is also an example of polymorphism
 */
package OOP2;
class animal{
    public void render(){
        System.out.println("This is an animal");
    }
}
class dog extends animal{
    public void render(){
        System.out.println("This is a dog");
    }
}
class goat extends animal{
    @Override
    public void render() {
        System.out.println("This is the goat");
    }
}
public class polymorphism {
    public static void main(String []args){
        animal o1 = new animal();
        o1.render();
//        a variable o1 is used in referring onjects of the subclass
        o1 = new dog();
        o1.render();
    }
}
