import java.util.Scanner;
class InvalidDateException extends Exception{
   InvalidDateException(String s){
    super(s);
   }
}
class MyDate{
    int day;
    int month;
    int year;
    MyDate(int day,int month,int year){
this.day=day;
this.month=month;
this.year=year;
    }
    void display(){
        System.out.println(day+"\t"+month+"\t"+year);
    }
}
class DateException{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter date in form of dd mm yyyy ");
        int d=input.nextInt();
        int m=input.nextInt();
        int y=input.nextInt();
       
        int flag=0;
      try{
        if(m<=0 || m>12)
                 throw new InvalidDateException("invalid date");
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
            {
                if(d>=1 && d<=31){
                    flag=1;
                }
                else
                throw new InvalidDateException("Invalid date");
            }
        else if(m==4 || m==6 || m==9 || m==11){
            if(d>=1 && d<=30){
                    flag=1;
                }
                else
                throw new InvalidDateException("Invalid date");
        }
        else if(m==2){
            if(y%4==0){
               if(d>=1 && d<=29){
                    flag=1;
                }
                else
                throw new InvalidDateException("Invalid date");
            }
            else if(d>=1 && d<=28){
                    flag=1;
                }
                else
                throw new InvalidDateException("Invalid date");
             }
                 
      if(flag==1){
        MyDate md= new MyDate(d,m,y);
        System.out.println("day \t month \t year");
        md.display();
      }
      }

      catch(Exception e){
        System.out.println(e);
      }
    }
}