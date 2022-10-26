package OOP3;
class Student{
    static class Subjects{
        public Subjects(String Sub1, String Sub2){
            this.Sub1 = Sub1;
            this.Sub2 = Sub1;
        }
        String Sub1;
        String Sub2;
        public void Display(){
            System.out.println("Sub1: " + Sub1 + "\n" + "Sub2: " + Sub2);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Student.Subjects stdSub = new Student.Subjects("Chemistry","Biology");
        stdSub.Display();
    }
}

