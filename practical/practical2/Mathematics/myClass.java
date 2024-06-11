package Mathematics;
public class myClass{
    public void Power(double a, double b){
    System.out.println("power of "+a+" and "+b+" is: "+Math.pow(a,b));
}
public void Factorial(int n){
       int  fact=1;
        
        for(int i=1;i<=n;i++){
        fact*=i;
        
    }
    System.out.print("factorial of "+n+" is:"+fact);
}
public void AddThree(double a,double b, double c){
       System.out.println("Addition of three number is: "+(a+b+c));
    }
}