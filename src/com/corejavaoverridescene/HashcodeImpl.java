package com.corejavaoverridescene;

public class HashcodeImpl {

    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("java");
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb1.hashCode()==sb2.hashCode());
        System.out.println(sb1.equals(sb2));
    }
}
