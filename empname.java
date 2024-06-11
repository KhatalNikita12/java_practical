import java.util.Scanner;
class NameException extends Exception{
    NameException(String s){
        super(s);
    }
}
public class empname {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name of employee");
        String nm=input.nextLine();
        try{
        for(int i=0;i<nm.length();i++){
        if(!Character.isLetter(nm.charAt(i))){
            throw new NameException("invalid name . name contain only character");
        }
        
        }System.out.println("employee name is "+nm);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
