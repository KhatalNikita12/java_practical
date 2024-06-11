import java.util.*;
public class eve {
   public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    System.out.println("enter how many number");
    int n=input.nextInt();
    for( int i=0;i<n;i++){
        System.out.println("enter "+i+" element");
        al.add(input.nextInt());
    }
    System.out.println(" element of array list: "+al);
    for(int a :al)
    if(a%2==0){
        System.out.println("even element: "+a);
    }



   }
}
