import java.util.Scanner;
class q7summatele{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many element");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        int i,j,sum=0;
        System.out.println("enter matrix element");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("matrix element are:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               sum=sum+a[i][j];
            }
        }
        System.out.println("addition of all element of matrix is:"+sum);

    }
}