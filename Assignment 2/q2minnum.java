// import java.util.Scanner;
// class q2minnum{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=input.nextInt();
//         int[] a=new int[n];
//         int i;
        
//         System.out.println("enter element of array");
//         for(i=0;i<n;i++){
//             System.out.println("enter "+(i+1)+" element");
//             a[i]=input.nextInt();
//         }
//         int min=a[0];
//         int secmin=Math.min(a[0], a[1]);
//         for(i=1;i<n;i++){
//             if(a[i]<min){
//                 min=a[i];
//             }
            
//         }
//         System.out.println("minimum number is "+ min);
//     }
// }
// package com.company;
import java.util.Scanner;

public class q2minnum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int min = Math.min(a[0], a[1]);
        int secondMin = Math.max(a[0], a[1]);

        for (int i = 2; i < n; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }
        }

        System.out.println("The second minimum element is: " + secondMin);
    }
}
