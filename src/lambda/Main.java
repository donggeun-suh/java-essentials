package src.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Height height = new Height();
        FilterCondition<Integer> oddNumberFilter = (Integer num) -> num % 2 == 1;

        height.filterHeight(oddNumberFilter);
        height.filterHeight(new FilterCondition<Integer>() {
            @Override
            public boolean condition(Integer o) {
                return o % 2 == 1;
            }
        });

        height.filterHeight(o -> o % 2 == 1);


        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        Stream<Integer> stream =  list.stream().filter(oddNumberFilter::condition);

        printStreamResult(stream);

        stream =  list.stream().filter(new Predicate<Integer>(){

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 1;
            }
        });

        printStreamResult(stream);


        stream =  list.stream().filter((o)-> o % 2 == 1);

        printStreamResult(stream);

    }



    public static <T> void printStreamResult(Stream<T> stream){
        stream.forEach((T i)->{
            System.out.print(i);
            System.out.print(" ");
        });

        System.out.println();
    }
}
