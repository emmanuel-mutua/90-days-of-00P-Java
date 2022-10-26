package OOP3;

/**
 * this is a program that is used to set the engene type for x car
 */
class car{
    String carName;
    String carType;

    public car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
        public String getCarName(){
        return this.carName;
        }
    class engene{
            String engeneType;
            void setEngene(){
                if (car.this.carType.equals("4WD")){
                    if (car.this.getCarName().equals("Crysler")){
                        this.engeneType = "smaller";
                    }else {
                        this.engeneType = "larger";
                    }
                }else {
                    this.engeneType = "larger";
                }
            }

        String getEngineType(){
            return this.engeneType;
        }
    }
}

public class accessDataOfNestedClass {
    public static void main(String[] args) {
        //outer class object
        car car1 = new car("Mercedes","4WD");
        //the inner class object
        car.engene engene1= car1.new engene();
        engene1.setEngene();
        System.out.println(car1.carName + "Engine type: " + engene1.getEngineType());

        //the second car
        car car2 = new car("Probox","2WD");
        car.engene engene2 = car2.new engene();
        engene2.setEngene();
        System.out.println(car2.carName + "Engine type: " + engene2.getEngineType());

    }
}
