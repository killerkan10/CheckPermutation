package com.company;

public class Main {

    String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        //System.out.println(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {

        if (s.length() != t.length()) {
            System.out.println("strings not the same length");
            return false;
        }
        System.out.println(sort(s).equals(sort(t)));
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {

        Main stringA = new Main();
        Main stringB = new Main();
        stringA.sort("hello");
        stringB.permutation("hello", "hello");
    }
}
