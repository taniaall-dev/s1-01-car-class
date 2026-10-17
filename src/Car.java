public class Car {

    static final String brand = "Seat";
    static String model = "Ibiza";
    final int power;

    public Car (int power){
        this.power = power;
    }

    public static void brake (){
        System.out.println("El vehicle està frenant");
    }
    public void accelerate (){
        System.out.println("El vehicle està accelerant");
    }
}
