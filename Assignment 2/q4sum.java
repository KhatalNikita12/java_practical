import java.util.Scanner;
class q4sum{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       
        System.out.println("enter the number");
        int n=input.nextInt();
         int a[]=new int[n];
        int sumeven=0;
        int sumodd=0;
        System.out.println("enter the number in array");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                sumeven=sumeven+a[i];
            }
            if(a[i]%2!=0){
                sumodd=sumodd+a[i];

            }
        }
        System.out.println("sum of even number is:"+sumeven);
        System.out.println("sum of odd number is:"+sumodd);
    }
}