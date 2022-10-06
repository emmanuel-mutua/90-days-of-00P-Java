package OOP1;

public class methods {
        private static void addnums(int a,int b){
            System.out.println("Sum: " + (a + b) + "\n");
        }

        private static void addnums(int j, int k,int m){
            System.out.println("sum :" + (j+k+m));
        }

        public static void main(String[] args) {
            addnums(1,3);
            addnums(1, 4, 4);
        }
}
