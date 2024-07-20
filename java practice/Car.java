import java.util.ArrayList;

// Define the Car class
class Car {
    // Attributes
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void show() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Create an ArrayList to hold Car objects
        ArrayList<Car> carList = new ArrayList<>();

        // Create 5 Car objects
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Mustang");
        Car car4 = new Car("Chevrolet", "Malibu");
        Car car5 = new Car("Nissan", "Altima");

        // Add Car objects to the ArrayList
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        // Iterate through the ArrayList and display details of each car
        for (Car car : carList) {
            car.show();
        }
    }
}
