public class Main {
    public static void main (String[] args){

        Car.brake();

        Car car = new Car(700, "Ibiza");
        Car car2 = new Car(400, "Leon");

        car2.accelerate();

        System.out.println("Los coches que se fabrican son marca: " + Car.getBrand() + " y modelo " + Car.getModel());
        System.out.println(Car.getBrand() + " " +  Car.getModel() + " " + car.getPower());
        System.out.println(Car.getBrand() + " " +  Car.getModel() + " " + car2.getPower());

        Car.setModel("Panda");

        System.out.println(Car.getBrand() + " " + Car.getModel() + " " + car.getPower());
        System.out.println(Car.getBrand() + " " + Car.getModel() + " " + car2.getPower());
    }
}
