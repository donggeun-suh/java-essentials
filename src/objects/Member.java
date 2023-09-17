package src.objects;

public class Member implements Comparable<Member>{
    String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return Integer.compare(this.name.length(), o.name.length());
    }
}
