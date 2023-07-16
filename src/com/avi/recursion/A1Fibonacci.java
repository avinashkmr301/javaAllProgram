package com.avi.recursion;

public class A1Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci "+ fib(8));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
