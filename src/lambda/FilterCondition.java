package src.lambda;

import java.util.function.Predicate;

@FunctionalInterface
public interface FilterCondition<T>  {
    boolean condition(T o);

}
