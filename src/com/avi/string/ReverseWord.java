package com.avi.string;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "Avinash kumar Thakur";
        reverseword(str);
    }
    static void reverseword(String s){
        String[] s1 = s.split(" ");
        for (int i=0;i< s1.length;i++){
            System.out.print(s1[i]+" ");
        }
        System.out.println();
       for (int i= s1.length-1;i>=0;i--){
           System.out.print(s1[i]+" ");
       }
    }

}
