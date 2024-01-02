package com.java8interface;

import java.time.LocalDate;

public interface PaymentInterface {

    public void m1();

    default String getMessage(){
        return "Hello World";
    }

    public static String getTodayDate(){
        return LocalDate.now().toString();
    }
}
