package com.avi.recursion;

public class A6SumOfDigit {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(digitSum(a));
    }
    static int digitSum(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)+digitSum(n/10);
    }
}
