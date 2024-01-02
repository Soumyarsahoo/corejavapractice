package com.corejavaoverridescene;

public class TryCatchFinally {

    public static void main(String[] args) {
        //scenario1
//        try{
//            System.out.println("try");
//        }catch(Exception e){
//            System.out.println("catch");
//        }finally{
//            System.out.println("finally");
//        }

        //scenario2
//        try{
//            System.out.println("try");
//            System.out.println(3/0);
//        }catch(Exception e){
//            System.out.println("catch");
//        }finally{
//            System.out.println("finally");

        //scenario3
        try
        {
            System.out.println("try");
//            System.exit(0);
            System.out.println(3 / 0);
        }catch(NullPointerException e) {
            System.out.println("catch");
        }finally{
            System.out.println("finally");
        }
    }



}
