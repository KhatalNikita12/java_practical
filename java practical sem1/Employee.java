import java.util.Scanner;
class Emp{
    int Eid;
    Emp(int Eid){
        this.Eid=Eid;
    }
    void display(){
        System.out.print(Eid+"\t");
    }
}
class EmpName extends Emp{
    String EmpName;
    EmpName(int Eid,String EmpName){
        super(Eid);
        this.EmpName=EmpName;

    }
    void display(){
        super.display();
        System.out.println(EmpName);
    }
}
class Employee{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter employee id and Name");
        int id=input.nextInt();
        input.nextLine();
        String nm= input.nextLine();
        EmpName En=new EmpName(id,nm);
        System.out.println(" id \t Name");
        En.display();
    }
}