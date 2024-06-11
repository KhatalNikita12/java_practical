import java.util.Scanner;
class ZeroNumberException extends Exception{
    ZeroNumberException(String s){
        super(s);
    }
}
class ZeroNumber{
     static int sum=0;//for sum of 1st and last digit
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        try{
            if(n==0)
                throw new ZeroNumberException("Number is zero");
            else
            {
                // int  fact=1;
                // for(int i=1;i<=n;i++){
                //     fact=fact*i;
                // }
                // System.out.println("factorial is fact:"+fact);
               
              
               int  lastdigit=n%10;
               int firstDigit = n;
             while (firstDigit >= 10) {
             firstDigit /= 10;
            }
            sum=firstDigit+lastdigit;
                System.out.println("sum is:"+sum);
            }
        }
        catch(Exception e){
          System.out.println("Exception occurs:"+e);
        }
    }
}