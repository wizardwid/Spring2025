package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h1")
public class Hobby {
    @Value("soccer")
    private String hobby_name;

    public String getHobby_name() {
        return hobby_name;
    }
}
