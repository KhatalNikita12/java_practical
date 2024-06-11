import java.util.Scanner;
class q8addmatrix{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int add[][]=new int[n][n];
        int i,j;
        System.out.println("enter element of matrix-A");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("enter element of matrix-B");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                b[i][j]=input.nextInt();
            }
        }
        
        //System.out.println("Matrix addition of A and B is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                add[i][j]=0;
                add[i][j]=a[i][j]+b[i][j];
            }
            
        }
        System.out.println("Matrix addition of A and B is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(add[i][j]+"\t");
            }
            System.out.println();
        }
    }
}