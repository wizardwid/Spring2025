package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("m1")
public class Member {
    @Value("kim")
    private String name;
    @Value("nickKim")
    private String nickname;
    @Value("seoul")
    private String addr;
    @Autowired()
    private Hobby hobby;

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddr() {
        return addr;
    }

    public String getHobby() {
        return hobby.getHobby_name();
    }
}
