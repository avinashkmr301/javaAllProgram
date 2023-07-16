package com.avi.recursion;

public class A8ReversrDigit {
    public static void main(String[] args) {
        reverseDigit(12345);
        System.out.println(rev);
    }
   static int  rev = 0;
    static void reverseDigit(int n){
        if (n==0){
            return;
        }
        int remender = (n%10);
        rev = rev*10 +remender;
        reverseDigit(n/10);
    }
}
