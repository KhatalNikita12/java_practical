import java.util.Scanner;
class perfect{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int i,sum=0;
        int[] a = new int[n];
        int[] perfectNumbers = new int[n];
        System.out.println("enter number");
        for( i=0;i<n;i++){
            System.out.println("enter "+i+" number");
            a[i]=input.nextInt();
        }


    }
}