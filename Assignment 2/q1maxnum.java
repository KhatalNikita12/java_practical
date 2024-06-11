import java.util.Scanner;
class q1maxnum{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int a[]=new int[n];
      int i, max=a[0];
        System.out.println("enter the element of array" );
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
          
                if(a[i]>max){
                   max=a[i];

                }
               
            }
             System.out.println("maximum number is:"+max);
       
    }
}