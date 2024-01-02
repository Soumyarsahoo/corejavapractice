package com.java8interface;

public class PaymentInterfaceImpl1 implements  PaymentInterface{


    @Override
    public void m1() {
        System.out.println("m1 is overridden in PaymentInterfaceImpl1"+PaymentInterface.getTodayDate());
    }

    @Override
    public String getMessage() {
       return "new Hello World";
    }

    public static void main(String[] args) {
        PaymentInterface paymentInterface = new PaymentInterfaceImpl1();
        paymentInterface.m1();
        System.out.println(paymentInterface.getMessage());
    }
}
