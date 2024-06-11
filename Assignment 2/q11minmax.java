import java.util.Scanner;
class q11minmax{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        int i,j;
        
        System.out.println("enter matrix element");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("disply matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int min=a[0][0];
        int max=a[0][0];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i][j]<min){
                    min=a[i][j];
                }
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("min number is "+min);
        System.out.println("max number is "+max);
    }
}