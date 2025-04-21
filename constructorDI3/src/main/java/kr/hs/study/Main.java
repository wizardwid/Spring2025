package kr.hs.study;

import kr.hs.study.bean.Cat;
import kr.hs.study.bean.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Cat obj1 = ctx.getBean("c1", Cat.class);
        obj1.prData();

        System.out.println("-------------------------------");

        Dog obj2 = ctx.getBean("d1", Dog.class);
        obj2.prData();

        ctx.close();
    }
}