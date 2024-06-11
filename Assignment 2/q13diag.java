import java.util.Scanner;
class q13diag{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter the matrix element");
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
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("sum of diagonal element is:"+sum);
    }
}