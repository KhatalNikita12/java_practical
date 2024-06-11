import java.util.Scanner;
class q12{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        
        int i,j;
        System.out.println("identity matrix of "+n+"X"+n+" is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    System.out.print("1\t");
                }
                else
                System.out.print("0\t");
            }
            System.out.println();
        }

    }
}