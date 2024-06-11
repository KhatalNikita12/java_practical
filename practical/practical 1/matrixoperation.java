import java.util.Scanner;
class matrixoperation{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int i,j,k;
        System.out.println("enter how many number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
         System.out.println("enter element of matrix A:");
        for( i=0;i<n;i++){
            for(j=0;j<n;j++){
               
                    a[i][j]=input.nextInt();
            }
        }
         System.out.println("enter element of matrix B:");
         for( i=0;i<n;i++){
            for(j=0;j<n;j++){
               
                    b[i][j]=input.nextInt();
            }
        }
    while(true){
    System.out.println("\n****menu of program*****\n --what operation you want to do on matrix--.");
    System.out.println("1) Addition\n 2) Multipication \n 3) Transpose of matrix \n 4) exit\n");
    System.out.println("enter your choice");
    int ch=input.nextInt();
    switch(ch){
        case 1:
             int add[][]=new int[n][n];
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    add[i][j]=0;
                   
                        add[i][j] =a[i][j] + b[i][j];
                    

                }
            }
            System.out.println("addition  is:");
              for( i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(add[i][j]+"\t");
                   
            }
            System.out.println();
        }
        break;
        case 2:
            int mul[][]=new int[n][n];
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    mul[i][j]=0;
                    for(k=0;k<n;k++){
                        mul[i][j] +=a[i][k] * b[k][j];
                    }

                }
            }
            System.out.println("multipication is:");
              for( i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(mul[i][j]+"\t");
                   
            }
            System.out.println();
        }
        break;
        case 3:
                int trans[][]=new int[n][n];
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        trans[i][j]=a[j][i];
                    }
                }
                System.out.println("transpose of matrix A is");
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        System.out.print(trans[i][j]+"\t");
                    }
                    System.out.println();
                }
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        trans[i][j]=b[j][i];
                    }
                }
                System.out.println("transpose of matrix B is");
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++){
                        System.out.print(trans[i][j]+"\t");
                    }
                    System.out.println();
                }
                    break;
        case 4:
            System.exit(0);
    }
    }
    }
}
/*enter how many number
2
enter element of matrix A:
2 3
4 5
enter element of matrix B:
1 9
6 7

****menu of program*****
 --what operation you want to do on matrix--.
1) Addition
 2) Multipication
 3) Transpose of matrix
 4) exit

enter your choice
1
addition  is:
3       12
10      12

****menu of program*****
 --what operation you want to do on matrix--.
1) Addition
 2) Multipication
 3) Transpose of matrix
 4) exit

enter your choice
2
multipication is:
20      39
34      71

****menu of program*****
 --what operation you want to do on matrix--.
1) Addition
 2) Multipication
 3) Transpose of matrix
 4) exit

enter your choice
3
transpose of matrix A is
2       4
3       5
transpose of matrix B is
1       6
9       7

****menu of program*****
 --what operation you want to do on matrix--.
1) Addition
 2) Multipication
 3) Transpose of matrix
 4) exit

enter your choice
4*/