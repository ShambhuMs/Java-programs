package com.Xworkz.java.practice.sorting;

public class InsertionSort{
    public static void main(String[] args) {
      //  int a[]={7,8,9,4,5,3,2,1,6};
        int a[]={7,8,3,2,1};
        for(int i=1;i<a.length;i++){//1,2
          int current=a[i];//8,3
            int j=i-1;//0,1,
            while(j>=0 && current<a[j] ){//8<7f,3<8t,3<7t,

                a[j+1]=a[j];//3-8,3-7,
                j--;//1-1,
            }
            a[j+1]=current;
        }


        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);

        }

    }
}


