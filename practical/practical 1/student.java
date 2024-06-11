import java.util.Scanner;
class student{
    int rollno;
    String name;
    void accept(int r1,String n1){
        rollno=r1;
        name=n1;
    }
    void display(){
        System.out.println("student detail");
        System.out.println(rollno+"\t"+name);
    }
}
public static void main(String args[]){
Scanner input=new Scanner(System.in);
student s=new student();
System.out.println("enter how many number");
int n=input.nextInt();
for(int i=0;<n;i++){
    s.accept
}
}