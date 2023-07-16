package com.avi.recursion;

public class A2BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,55,66,778,895};
        int target = 895;
        System.out.println("data present at index: "+search(a,target,0,a.length-1));
    }
    static int search(int[] a, int target, int s, int e){
        if (s>e){
            return -1;
        }

        int m = s +(e-s)/2;
       if (a[m] == target){
           return m;
       }

       if(target < a[m]){
           return search(a,target,s,e=m-1);
       }
       return search(a,target,s=m+1,e);

    }
}
