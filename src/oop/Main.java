package src.oop;

public class Main {
    public static void main(String[] args) {
        // interface -> abstract class -> parent class -> child class
        EV6 myCar = new EV6(2865);
        // interface 로 부터 상속받은 default method 직접 호출
        myCar.honk();
        // static method 의 경우 interface 가 직접호출
        System.out.println(Car.isAutonomousDriving());
        System.out.println(myCar.getBatteryModel());
    }
}
