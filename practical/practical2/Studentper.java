import sy.SYMarks;
import ty.TYMarks;
import java.util.Scanner;
class Studentper{
    int rollno;
    String name;
    SYMarks sym;
    TYMarks tym;
    Studentper(  int rollno,String name,SYMarks sym,TYMarks tym){
        this.rollno=rollno;
        this.name=name;
        this.sym=sym;
        this.tym=tym;
    }
   public  String toString(){
        return rollno+"\t"+name+"\t"+sym+"\t"+tym;
    }
    void calcgrade(){
        int total=sym.comptotal+tym.theory+tym.practical;
        double per=total/12;
        if (per >= 70) {
            System.out.println("A");
            System.out.println(per);
        } else if (per >= 60) {
            System.out.println("B");
             System.out.println(per);
        } else if (per >= 50) {
            System.out.println("C");
             System.out.println(per);
        } else if (per >= 40) {
            System.out.println("Pass");
             System.out.println(per);
        } else {
            System.out.println("FAIL.!");
             System.out.println(per);
        }
    }
        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            System.out.println("enter how many record");
            int n=input.nextInt();
            Studentper sp[]=new Studentper[n];
            System.out.println("enter record");
         for(int i=0;i<n;i++){
                System.out.println("Enter " + (i + 1) + " student daclearta");
                System.out.println("Enter Roll no:");
                int r1 = input.nextInt();
                input.nextLine();

                System.out.println("Enter Student Name:");
                String n1 = input.nextLine();
                    System.out.println("enter sy marks computer total, math total and electronic total");
                int  ct=input.nextInt();
                int  mt=input.nextInt();
                int  et=input.nextInt();
                SYMarks sym=new SYMarks(ct,mt,et);
                System.out.println("enter ty marks   theory & practical");
                
                int  t=input.nextInt();
                int  p=input.nextInt();
                TYMarks tym=new TYMarks(t,p);
                sp[i]=new Studentper(r1,n1,sym,tym);
         }
       
        System.out.println("display student record");
       System.out.println("R.No\tName\tCompTotal\tMathTotal\tElectTotal\tTheory\t\tPractical");
        for(int i=0;i<n;i++){
            System.out.println(sp[i]);
            sp[i].calcgrade();
        }
}
 }