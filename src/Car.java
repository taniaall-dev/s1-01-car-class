public class Car {

    private static final String BRAND = "Seat";
    private static String model;
    private final int power;

    public Car (int power, String model){
        this.power = power;
        Car.model = model;
    }

    public static void brake (){
        System.out.println("El vehicle està frenant");
    }
    public void accelerate (){
        System.out.println("El vehicle està accelerant");
    }

    public static String getBrand(){
        return BRAND;
    }

    public static String getModel(){
        return model;
    }
    public static void setModel(String model){
        Car.model = model;
    }

    public int getPower(){
        return power;
    }
}
