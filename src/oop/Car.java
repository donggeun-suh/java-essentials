package src.oop;

interface Car {

    // 기본적으로 public method 이며, 제한자를 생략할 수 있다.
    String getType();

    String getManufacturer();

    String getBrand();

    int price();

    // 추상클래스의 경우 public 이지만, default static 의 경우 구현이 허용된다.
    // default method 를 선언하여 상속할 수 있다.
    default void honk(){
        printHonkSound();
    }

    // static method 도 구현을 할 수 있게 한다.
    static boolean isAutonomousDriving(){
        return true;
    }

    private void printHonkSound(){
        System.out.println("honk!! honk!!");
    }
}
