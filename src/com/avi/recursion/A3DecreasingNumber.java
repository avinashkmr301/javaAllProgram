package com.avi.recursion;

public class A3DecreasingNumber {
    public static void main(String[] args) {
        dec(5);

    }
    static void dec(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}
