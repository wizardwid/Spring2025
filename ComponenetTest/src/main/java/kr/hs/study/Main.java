package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        Member obj1 = ctx.getBean("m1", Member.class);
        System.out.println(obj1.getName());
        System.out.println(obj1.getNickname());
        System.out.println(obj1.getAddr());
        System.out.println(obj1.getHobby());
    }
}