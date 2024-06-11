// import java.io.*;
// import java.util.Scanner;
// class file1{
//     public static void main(String args[]) {
//       Scanner input= new Scanner(System.in);
//       System.out.println("how many number")  ;
//                   int n=input.nextInt();
//                   String a[] = new String[n];
//         try(
//                FileWriter fw=new FileWriter(args[0]);
//                ){
                  
//              System.out.println("enter name");
//         for(int i=0;i<n;i++){
//             input.nextLine();
//             a[i]=input.nextLine();
//             fw.write(a[i]);
//     //    fw.write("\n");
//         }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

import java.io.*;
import java.util.Scanner;

class file1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names?");
        int n = input.nextInt();

        input.nextLine();

        String a[] = new String[n];
        String filename = args[0];

        try (FileWriter fw = new FileWriter(filename)) {
            System.out.println("Enter names:");
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLine();
                fw.write(a[i]);
                fw.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
