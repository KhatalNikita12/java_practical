/*Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal) information using toString().*/
class employee{
    int Empid;
    String Empname;
    String Empdesignation;
    double Empsal;
    employee( int Empid,String Empname,String Empdesignation,double Empsal){
        this.Empid=Empid;
        this.Empname=Empname;
        this.Empdesignation=Empdesignation;
        this.Empsal=Empsal;
    }
    public String toString(){
        return Empid+"\t"+Empname+"\t"+Empdesignation+"\t\t\t"+Empsal;
    }
    public static void main(String args[]){
        employee emp=new employee(1,"Mr.patil","Manager",45000);
        System.out.println("empid \t Empname \t Empdestination \t Empsal");
        System.out.println(emp);
    }
}