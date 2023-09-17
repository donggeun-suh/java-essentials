package src.object;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("Case1: equals!!");
        }

        if(!obj1.equals(obj3)){
            System.out.println("Case2: equals!!");
        }

        Key key1 = new Key(1);

        HashMap<Key, String> keyHashMap = new HashMap<>();

        keyHashMap.put(key1, "equals!!");

        if(keyHashMap.containsKey(new Key(1))){
            System.out.println("Case3: "+ keyHashMap.get(new Key(1)));
        }

        Member cloneableMember1 = new Member("deepCopy", new String[]{"admin"});
        Member cloneableMember2 = (Member) cloneableMember1.getClone();
        boolean deepCopy = cloneableMember1.equals(cloneableMember2) && cloneableMember1.hashCode() != cloneableMember2.hashCode();
        if(deepCopy){
            System.out.println("Case4: Deep Copy!!");
        }


    }
}
