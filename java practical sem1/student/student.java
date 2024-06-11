package student;
 class studentInfo{
 public   int rollno;
 public   String name;
 public   String cls;
 //public   double per;
public studentInfo(int rollno,String name,String cls){
        this.rollno=rollno;
        this.name=name;
        this.cls=cls;
        //this.per=per;
    }
    public String toString(){
        return rollno +"\t"+name+"\t"+cls;
    }
}