package com.avi.recursion;

public class A4IncreasingOrder {
    public static void main(String[] args) {
        inc(5);
    }
    static void inc(int n){
        if (n == 0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
}
