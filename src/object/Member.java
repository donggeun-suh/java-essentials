package src.object;

import java.util.Arrays;

// Cloneable 자체는 구현이 없다.
public class Member implements Cloneable{
    String id;
    String[] authorization;

    public Member(String id){
        this.id = id;
    }

    public Member(String id, String[] authorization){
        this.id = id;
        this.authorization = authorization;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Member){
            Member member = (Member) o;
            return member.id.equals(this.id);
        }

        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    // Object의 clone을 재정의해서 깊은 복제를 만듦
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Member member = (Member) super.clone();
        member.id = this.id;
        member.authorization =  Arrays.copyOf(this.authorization, this.authorization.length);
        return member;
    }

    // Object의 clone은 기본적으로 얉은 복제
    public Member getClone() throws CloneNotSupportedException {
        return (Member) clone();
    }


}
