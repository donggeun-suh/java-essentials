package src.object;

import java.util.Objects;

public class Key {

    int number;

    public Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return number == key.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
