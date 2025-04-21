public class Main {
    public static void main(String[] args) {

    }
    public static void memberUse1(){
        Member m = new Member();
    }
    public static void memberUse2(Member m){
        Member m2 = m;
    }
}

class Member{
    String name;
    String nickName;

    public Member() {
    }
}