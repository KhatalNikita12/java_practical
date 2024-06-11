import java.util.Scanner;
class Clock 
{
   int hours;
   int minutes;
   int seconds;
   
    Clock(int hours, int minutes, int seconds) 
    {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
    } 
    void isTimeValid()
        {
        if(hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60)
        {
        System.out.println("time is valid");
        }
        else
        {
        System.out.println("time is not valid");
       }
    }   
    void isTimeMode()
    {
    if(hours <12)
    {
    System.out.println("time=" +hours+":"+minutes+":"+seconds+"AM");
    }
    else
    {
    hours=hours-12;
    System.out.println("time=" +hours+":"+minutes+":"+seconds+"PM");
    }
   } 
  
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       System.out.println("enter time");
        System.out.println("enter hours");
        int h=input.nextInt();
        System.out.println("enter min");
        int m=input.nextInt();
        System.out.println("enter sec");
        int s=input.nextInt();
        Clock c = new Clock(h,m,s); 
        c.isTimeValid();
        c.isTimeMode();
    }
}
