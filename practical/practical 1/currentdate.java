import java.util.*;
import java.text.SimpleDateFormat;
class currentdate{
    public static void main(String args[]){
        Date d=new Date();
        System.out.println("current date and time is:=>"+d);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("current date is:"+sdf.format(d));
            sdf=new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("current date is:"+sdf.format(d));

            sdf=new SimpleDateFormat("EEEEEEE MMMM dd yyyy");
             System.out.println("current date is:"+sdf.format(d));

            sdf=new SimpleDateFormat("EEE MMMM dd hh:mm:ss z yyyy");
            System.out.println("current date and time is:"+sdf.format(d));

            
            sdf=new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
            System.out.println("current date and time is:"+sdf.format(d));

            sdf=new SimpleDateFormat(" hh:mm:ss ");
            System.out.println("current time is:"+sdf.format(d));

            sdf=new SimpleDateFormat("w");
            System.out.println("current  week of year is:"+sdf.format(d));

            sdf=new SimpleDateFormat("W");
            System.out.println("current week of month is:"+sdf.format(d));

            sdf=new SimpleDateFormat("D");
            System.out.println("current day of year is:"+sdf.format(d));
            
    }
}
/*current date and time is:=>Wed Jul 26 19:11:58 IST 2023
current date is:26/07/2023
current date is:26-07-2023
current date is:Wednesday July 26 2023
current date and time is:Wed July 26 07:11:58 IST 2023
current date and time is:26/07/23 07:11:58 pm +0530
current time is: 07:11:58
current  week of year is:30
current week of month is:5
current day of year is:207*/