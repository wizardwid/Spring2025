package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component("t2")
public class TestBean2 {
    public TestBean2(){
        System.out.println("TestBean2의 기본생성자");
    }
}
