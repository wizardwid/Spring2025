package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
@Lazy
@Scope("prototype")
public class TestBean1 {
    public TestBean1(){
        System.out.println("TestBean1의 기본생성자");
    }
}
