// package com.company;
import java.util.Scanner;
 class demo{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]= new int[n];
        int min=a[0];
        System.out.println("enter element in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println(min);
    }
}
