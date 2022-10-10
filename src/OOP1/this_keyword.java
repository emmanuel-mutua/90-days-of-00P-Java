package OOP1;
class room{
    //this is being used to refer to the current room_number referred in the constructor and in aid of passing the patameters
    int room_number;
    room(int room_number){
        this.room_number = room_number;

    }
}
//using it in the getter and setter
class lecture{
    private int lecture_Reg = 33;

    public int getLecture_Reg() {
        return this.lecture_Reg;
    }

    public void setLecture_Reg(int lecture_Reg) {
        this.lecture_Reg = lecture_Reg;
    }
}

public class this_keyword {
    public static void main(String[]args){
//        usage 1
        room rm = new room(8);
        System.out.println(" The room number is:" + rm.room_number);

//        usage 2
        lecture obj = new lecture();
        obj.setLecture_Reg(111);
        System.out.println("the lecs registration number is:" + obj.getLecture_Reg());
    }
}

/*
the uses of the this keyword
    - Invoke current class constructor
    - Invoke current class method
    - Return the current class object
    - Pass an argument in the method call
    - Pass an argument in the constructor call.
 */
