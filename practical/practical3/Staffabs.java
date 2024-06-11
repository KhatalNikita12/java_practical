import java.util.Scanner;
 abstract class staff{
    protected int id;
    protected String name;
    staff( int id, String name){
        this.id=id;
        this.name=name;
    }
 }
 class Officestaff extends staff{
    String deptname;
    Officestaff( int id, String name,String deptname){
        super(id,name);
        this.deptname=deptname;
    }
    public String toString(){
        return id+"\t"+name+"\t"+deptname;
    }
 }
 class Staffabs{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many number");
        int n=input.nextInt();
        Officestaff os[]=new Officestaff[n];
        for(int i=0;i<n;i++){
             System.out.println("enter"+(i+1)+"staff detail");
         System.out.println("enter id");
         int id=input.nextInt();
         input.nextLine();
          System.out.println("enter name");
          String n1=input.nextLine();
           System.out.println("enter department");
          String dn=input.nextLine();
          os[i]=new Officestaff(id,n1,dn);
          }
           System.out.println("display record");
           System.out.println("id\tname\tdeptname");
           for(int i=0;i<n;i++){
             System.out.println(os[i]);
           }
    }
 }