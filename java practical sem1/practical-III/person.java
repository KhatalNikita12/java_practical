/*Write program to define class Person with data member as Personname,Aadharno, Panno. 
Accept information for 5 objects and display appropriate information (use this keyword). */
class person{
    String Personname;
     long Aadharno;
    String Panno;
    person( String Personname,long Aadharno,String Panno){
        this.Personname=Personname;
        this.Aadharno=Aadharno;
        this.Panno=Panno;
    }
    void display(){
        System.out.println(Personname+"\t\t"+Aadharno+"\t\t"+Panno);
    }
    public static void main(String args[]){
        person obj1=new person("Nikita",324004409292L,"MGGPK1809R");
        person obj2=new person("Rutuja",324005609292L,"MGGPK1809R");
        person obj3=new person("Pallavi",535004409292L,"MGGPK1809R");
        person obj4=new person("Anuja",954004409292L,"MGGPK1809R");
        person obj5=new person("Anushka",324224409292L,"MGGPK1809R");
         System.out.println("personname\tAadharno\t\tPanno");
        obj1.display();
         obj2.display();
          obj3.display();
           obj4.display();
            obj5.display();
    }
}