import java.util.Scanner;
class q9transposemat{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        int trans[][]=new int[n][n];
        System.out.println("enter the element");
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
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               trans[i][j]=a[j][i];
            }
        }
        System.out.println("display transpose matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(trans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}