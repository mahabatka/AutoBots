package com.autobots.bankApplication;

public class Task {
    public static void main(String[] args) {
        int result = sum(5,5);
        System.out.println(result);
        int result1 = sum(5,5);
        System.out.println(result1);
    }



    public static int sum(int a, int b){
        return a + b;
    }

    public static void sum1( int a , int b){
        System.out.println(a + b);
    }
}
