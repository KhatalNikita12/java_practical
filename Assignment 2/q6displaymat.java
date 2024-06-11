import java.util.Scanner;
class q6displaymat{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many number" );
        int n=input.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter element of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
         System.out.println("display element");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}