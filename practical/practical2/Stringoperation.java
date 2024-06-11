import string.Concat;
import string.Comp;
import java.util.Scanner;
class Stringoperation
{
   
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        // input.nextLine();
        System.out.println("enter 1st string");
        String str1=input.nextLine();
        System.out.println("enter 2nd string");
        String str2=input.nextLine();
       
         Concat obj2=new Concat();
         System.out.println(obj2.Con(str1,str2));
          Comp obj1=new Comp();
        System.out.println(obj1.Compare(str1,str2));
    }

}