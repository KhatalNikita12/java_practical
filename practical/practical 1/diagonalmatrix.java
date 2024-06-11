import java.util.Scanner;
class diagonalmatrix{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int i,j;
        int a[][]=new int[n][n];
        System.out.println("enter element of matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        while(true){
        System.out.println("***menu of program***");
        System.out.println("\n1)sum of diagonal element\n 2)sum of upper diagonal element\n 3)sum of lower diagonal element\n 4)exit ");
        System.out.println("enter your choice");
        int ch=input.nextInt();
        switch(ch){
            case 1:
                int diag=0;
         
               for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i==j){
                    diag = diag+a[i][j];
                }
                }
                }
                System.out.println("sum of diagonal element is "+diag);
                break;
            case 2:
                int upperdiag=0;
         
               for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i<j){
                    upperdiag = upperdiag+a[i][j];
                }
                }
        }
                System.out.println("sum of upper diagonal element is "+upperdiag);
                break;
                case 3:
                int lowerdiag=0;
                for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i>j){
                    lowerdiag = lowerdiag+a[i][j];
                }
        }
        }
                System.out.println("sum of lower diagonal element is "+lowerdiag);
                break;                
            case 4:
                System.exit(0);
        }
}
    }
}