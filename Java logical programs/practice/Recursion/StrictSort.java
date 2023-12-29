package com.Xworkz.java.practice.Recursion;

public class StrictSort {

public static boolean find(int a[],int index){

if(index==a.length-1){
    return true;
}
    if(a[index]<=a[index+1]){
        return  find(a,index+1);

    }
    else {
        return false;
    }

}
    public static void main(String[] args) {
        int a[]={1,3,2,4,5};
        System.out.println(find(a,0));
    }
}
