import java.util.Scanner;
import student.*;
class stud{
    studentinfo info;
        studentper per;
        // stud(student info,student per){
        //     this.info;
        //     this.per;
        // }
        public String toString(){
            return info+"\t"+per;
        }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter roll no");
        int r1=input.nextInt();
        System.out.println("enter name");
        input.nextLine();
        String n1=input.nextLine();
        System.out.println("enter class");
        String c1=input.nextLine();
        // System.out.println("enter ");
        // int r1=input.nextInt();
        studentinfo info=new studentinfo(r1,n1,c1);
        System.out.println("enter mark of 3 subject");
        int m1=input.nextInt();
        int m2=input.nextInt();
        int m3=input.nextInt();
        studentper per =new studentper(m1,m2,m3);
        studentper.percentage();
    }
}