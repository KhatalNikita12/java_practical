import java.util.Scanner;
class Person{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the first name ");
    String fname=input.nextLine();
    System.out.println("enter the middle name ");
    String mname=input.nextLine();
    System.out.println("enter the last name ");
    String lname=input.nextLine();
    System.out.println(" name in original sequence");
    System.out.println(fname+" "+mname+" "+lname);
  
    String cm=mname.substring(0,1).toUpperCase();
    String rm=mname.substring(1,mname.length());
     System.out.println(" name after operation");
    System.out.println(lname+" "+fname+" "+cm+rm);
    }
}