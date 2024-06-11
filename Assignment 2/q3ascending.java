1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111import java.util.Scanner;
class q3ascending{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        float a[]=new float[n];
        int i,j;
        System.out.println("enter element");
        for(i=0;i<n;i++){
            a[i]=input.nextFloat();
        }
        System.out.println("original array");
        for(float ele:a){
            System.out.print(ele+" ");
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
              float  temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        System.out.println("\narray in ascending order are:");
        for(float ele:a){
            System.out.print(ele+" ");
        }
    }
}