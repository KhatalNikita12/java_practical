import java.util.Scanner;
class Health extends Exception{
    String msg="you are covid positive !";
    public String toString(){
        return msg;
    }
  
}
class patient{
    String pname;
    int page;
    int poxylevel;
    int pHRTCreport;
    patient(String pname,int page,int poxylevel,int pHRTCreport){
        this.pname=pname;
        this.page=page;
        this.poxylevel=poxylevel;
        this.pHRTCreport=pHRTCreport;
    }
    public void display(){
        System.out.println( pname+"\t"+page+"\t"+poxylevel+"\t"+pHRTCreport);
    }
}
class hospital{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("enter name");
            String pn=input.nextLine();
            System.out.println("enter age");
            int pa=input.nextInt();
            System.out.println("enter oxygen level");
            int po=input.nextInt();
            System.out.println("enter HRCT report");
           int ph=input.nextInt();
           patient p=new patient(pn,pa,po,ph);
           if(p.poxylevel<95 && p.pHRTCreport>10){
            throw new Health() ;
            
           }
           System.out.println("patient record");
           p.display();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}