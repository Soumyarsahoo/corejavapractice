package com.corejavaoverridescene;

public class B extends A{

//    @Override
//    public void m1(){
//        System.out.println("m1 in B");
//    }

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
