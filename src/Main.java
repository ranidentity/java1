import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Ali",30,3.2);
//        Student student2 = new Student("Buma",24,3);

//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//
//        Car[] cars = {car1,car2,car3};
//        // loop through obj array
//        for(Car car: cars){
//            car.Start();
//        }

        Friend friend1 = new Friend("Ali");
        Friend friend2 = new Friend("Bubub");

        Friend.showFriends();
    }
}