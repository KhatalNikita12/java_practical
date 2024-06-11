import java.util.Scanner;
class InvalidNameException extends Exception{
    InvalidNameException(String s){
        super(s);
    }
}
class Employee{
    String name;
Employee(String name){
    this.name=name;
}

}
class NameException
{
    public static void main(String args[])
    {
            Scanner input=new Scanner(System.in);
            System.out.println("enter name");
            String nm=input.nextLine();
            try
            {
                for(int i=0;i<nm.length();i++)
                {
                    char word=nm.charAt(i);
                    if((word>='a' && word<='z') ||( word>='A' && word<='Z') )
                    {}
                    else{
                        throw new InvalidNameException("invalid name . Name should contain only character. ");
                    }
                }
                // Employee e=new Employee(nm);
                   System.out.println("name is:"+nm);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
}