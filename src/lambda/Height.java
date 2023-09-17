package src.lambda;

import java.util.ArrayList;
import java.util.List;

public class Height {
    List<Integer> list = new ArrayList<>();

    public Height(){
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
    }

    public void filterHeight(FilterCondition<Integer> filterCondition){
        list.removeIf(num -> !filterCondition.condition(num));
        System.out.println(list);
    }
}
