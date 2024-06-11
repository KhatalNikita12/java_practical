
import Mathematics.myClass;
import java.util.Scanner;
public class mathoperation{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("power of A to B");
        System.out.println("enter value of A and B");
       Double a=input.nextDouble();
       Double b=input.nextDouble();
        myClass obj=new myClass();
        obj.Power(a,b);

        System.out.println("enter number to find factorial:");
        int n=input.nextInt();
        myClass obj1=new myClass();
        obj1.Factorial(n);

        System.out.println("\nenter value of A , B and C");
      Double x=input.nextDouble();
       Double y=input.nextDouble();
        Double z=input.nextDouble();
       myClass obj2=new myClass();
       obj2.AddThree(x,y,z);
    }
}