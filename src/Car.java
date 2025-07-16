public class Car {
    String model;
    String color;

    Car(){
    }

    void Start(){
        System.out.println("Engine started");
    }

    void stop(){
        System.out.println("Engine stopped");
    }
    void drive(){
        System.out.println("You drive "+model);
    }
    void brake(){
        System.out.println("You brake "+model);
    }
}
