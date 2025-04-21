package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        obj1.prData();

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        obj2.prData();

        TestBean2 obj3 = ctx.getBean("t3", TestBean2.class);
        obj3.prData();

        TestBean2 obj4 = ctx.getBean("t4", TestBean2.class);
        obj4.prData();

        ctx.close();
    }
}