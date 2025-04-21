package kr.hs.study.bean;

import java.security.PrivateKey;

public class Cat implements Animal{
    private String color;
    private int leg;
    private Owner owner;

    public Cat(String color, int leg, Owner owner) {
        this.color = color;
        this.leg = leg;
        this.owner = owner;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    public void prData(){
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        System.out.println("owner : " + owner);
    }
}
