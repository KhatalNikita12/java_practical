import java.util.Scanner;
class q10multmat{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
         int b[][]=new int[n][n];
        int mult[][]=new int[n][n];
        int i,j,k;
        System.out.println("enter matrix element-A");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
          System.out.println("enter matrix element-B");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                b[i][j]=input.nextInt();
            }
        }
      
 
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                mult[i][j]=0;
                for(k=0;k<n;k++){
                   
                    mult[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("matrix multiplication");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(mult[i][j]+"\t");
            }
            System.out.println();
        }
    }
} 