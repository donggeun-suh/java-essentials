package src.objects;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member> {


    @Override
    public int compare(Member o1, Member o2) {
        // return Integer.compare(o1.name.length(), o2.name.length()) 로 대체할 수 있다.
        if(o1.name.length() > o2.name.length()){
            return 1;
        } else if(o1.name.length() < o2.name.length()) {
            return -1;
        }
        return 0;
    }
}
