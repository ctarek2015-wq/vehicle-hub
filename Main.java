public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        car.describe();
        car.startEngine();
        car.honk();

        System.out.println();

        Bike bike = new Bike("Giant", "Escape", 2019, "Mountain");
        bike.describe();
        bike.startEngine();
        bike.ringBell();

        System.out.println();
        System.out.println("Demonstrating encapsulation:");
        car.setYear(2021);
        System.out.println("Updated car year: " + car.getYear());
        bike.setType("Road");
        System.out.println("Updated bike type: " + bike.getType());
    }
}
