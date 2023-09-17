package src.reflection;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * forName 과 getClass 모두 알아두자.
         * */
        Car car = new Car(10, 100000);
        Class<? extends Car> clazz1 = car.getClass();

        try {
            Class<?> clazz2 = Class.forName("src.reflection.Car");
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        /*
         * Declared 는 해당 class 의 것들만,일반 메서드는 상속한 것들까지 모두 포함.
        * */
        Field[] fields1 = clazz1.getDeclaredFields();
        Field[] fields2 = clazz1.getFields();

        Constructor[] constructors1 = clazz1.getConstructors();
        Constructor[] constructors2 = clazz1.getDeclaredConstructors();

        Method[] methods1 = clazz1.getMethods();
        Method[] methods2 = clazz1.getDeclaredMethods();

        /*
         * Declared 는 해당 class 의 것들만,일반 메서드는 상속한 것들까지 모두 포함.
         * */

        List<Constructor> constructorList =  new ArrayList<>(Arrays.asList(car.getClass().getDeclaredConstructors()));

        for (Constructor cons : constructorList
             ) {
        }



    }
}
