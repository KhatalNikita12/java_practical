import java.util.Scanner;
class continent{
     String cname;
}
class country extends continent{
     String cntyname;
}
class state extends country{
    String sname;
    String place;
    state(String cname,String cntyname,String sname,String place){
        this.cname=cname;
        this.cntyname=cntyname;
        this.sname=sname;
        this.place=place;
         }
    // public    String toString(){
    //         return cname+"\t\t"+cntyname+"\t\t"+sname+"\t\t"+place;
    //     }
    public void display(){
        System.out.println(cname+"\t"+cntyname+"\t"+sname+"\t"+place);
    }
   
}
class multilevel{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter contenent name");
        String cn=input.nextLine();
        System.out.println("enter country name");
        String cntn=input.nextLine();
        System.out.println("enter state name");
        String sn=input.nextLine();
        System.out.println("enter place name");
        String pn=input.nextLine();
        state s=new state(cn,cntn,sn,pn);
        System.out.println("continent\tcounty\t\tstate\tplace");
        // System.out.println(s);
        s.display();
    }
}