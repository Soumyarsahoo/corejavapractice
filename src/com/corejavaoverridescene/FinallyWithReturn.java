package com.corejavaoverridescene;

public class FinallyWithReturn {
    public static void main(String[] args) {

        //scenario1
//        try {
//            System.out.println("try");
//            return;
//        }catch(NullPointerException e) {
//            System.out.println("catch");
//            return;
//        }finally{
//            System.out.println("finally");
//            return;
//        }
        System.out.println(m1());

    }

    public static int m1(){
        try{
            return 111;
        }catch(Exception e){
            return 222;
        }finally {
            return 333;
        }
    }

}

