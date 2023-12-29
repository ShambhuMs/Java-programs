package com.Xworkz.java.practice.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={7,8,3,1,2,5,4,9,6};
        for(int i=0;i<a.length;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
