public class Main {
    public static void main (String[] args){
        Car.brake();
        Car car = new Car(700);
        Car car2 = new Car(400);

        car.accelerate();

        System.out.println("Los coches que se fabrican son: " + Car.brand + " " + Car.model);
        System.out.println(Car.brand + " " +  Car.model + " " + car.power);
        System.out.println(Car.brand + " " +  Car.model + " " + car2.power);

        Car.model = "Leon";

        System.out.println(Car.brand + " " +  Car.model + " " + car.power);
        System.out.println(Car.brand + " " +  Car.model + " " + car2.power);

    }
}
