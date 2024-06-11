import java.util.Scanner;
class q5presentinarr{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        int a[]=new int[n];
        boolean present=false;
        int i;
        System.out.println("enter the element of array");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("enter element to search:");
        int ele=input.nextInt();
        for( i=0;i<n;i++){
            if(ele==a[i]){
                present=true;
            }
        }
        if(present){
            System.out.println(ele+" is present in array and found at "+ i +" position");
        }
        else
         System.out.println("element not found");

    }
}
/*enter the element of array
223
56
1
90
568
enter element to search:
568
568 is present in array and found at 5 position
enter number
3
enter the element of array
56
34
1
enter element to search:
5
element not found
*/