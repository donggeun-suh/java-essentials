package src.objects;

import java.util.Comparator;
import java.util.Objects;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        /*
        * Compare
        * */
        Member m1  = new Member("Peter");
        Member m2 =  new Member("Sam");

        System.out.println(Objects.compare(m1, m2, new MemberComparator()));
        System.out.println(Objects.compare(m1, m2, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return Integer.compare(o1.name.length(),o2.name.length());
            }
        }));

        System.out.println(Objects.compare(m1, m2, (o1, o2)->{
            return Integer.compare(o1.name.length(),o2.name.length());
        }));

        System.out.println(Objects.compare(m1,m2, Comparator.comparingInt(o->o.name.length())));

        System.out.println(m1.compareTo(m2));

        /*
         * Null, Not Null
         * */
        String s1 = null;

        System.out.println(Objects.isNull(s1));
        System.out.println(!Objects.nonNull(s1));

        try {
            System.out.println(Objects.requireNonNull(s1));
            System.out.println(Objects.requireNonNull(s1, "The String is null"));
            System.out.println(Objects.requireNonNull(s1,()-> "The String is null"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Objects.requireNonNull(s1, "The String is null"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(Objects.requireNonNull(s1,()-> "The String is null"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*
         * Times
         * */
        int cnt = 0;
        long nanoTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            cnt += i;
        }
        System.out.println(System.nanoTime() - nanoTime);

        cnt =0;

       long currentTimeMills =  System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            cnt += i;
        }
        System.out.println(System.currentTimeMillis() - currentTimeMills);


        /*
         * Properties & Envs
         * */
        Properties props = System.getProperties();

        for (Object key :props.keySet().toArray()) {
            System.out.println("[" + key + "]: "+ props.getProperty((String) key));
        }

        System.out.println(System.getenv("JAVA_HOME"));

        for (Object key :System.getenv().keySet().toArray()) {
            System.out.println("[" + key + "]: "+ System.getenv((String) key));
        }



    }
}
