public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 5000.00;
    boolean isRunning = false;

    void Start(){
        isRunning = true;
        System.out.println("Engine started");
    }

    void stop(){
        isRunning = false;
        System.out.println("Engine stopped");
    }
    void drive(){
        System.out.println("You drive "+model);
    }
    void brake(){
        System.out.println("You brake "+model);
    }
}
