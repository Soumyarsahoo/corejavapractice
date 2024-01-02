package com.corejavaoverridescene;

public class FinalizeScene {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeScene f = new FinalizeScene();
        f=null;
        System.gc();
    }
}
