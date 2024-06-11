import java.util.Scanner;
class descarray{
    public static void main(String argc[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many number");
        int n=input.nextInt();
        int i,j,temp;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" element");
             a[i]=input.nextInt();
        }
        System.out.println(" element of original array");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
             }
            System.out.println("\nelement in desending order are:");
        for(i=0;i<n;i++){
        System.out.print(+a[i]+"\t");
       
        }
       
    }
}