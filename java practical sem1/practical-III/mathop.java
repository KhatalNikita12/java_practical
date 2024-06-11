
/*Write a package for Operation, which has two classes, Addition and Maximum. Addition has 
two methods add () and subtract (), which are used to add two floategers and subtract two, float 
values respectively. Maximum has a method max () to display the maximum of two floategers*/
/*package mathoperation;
public class Addition{ //class Addition
public float a;
public float b;

public void add(float a, float b){
    System.out.println( a+b);
}
public void subtract(float a, float b){
    System.out.println( a-b);
}
}
--------------------------------------------------------------
package mathoperation; //class Maximum
public class Maximum{
public float a;
public float b;

public void max(float a,float b ){
    if(a>b)
    System.out.println(a+" is maximum number");
    else
    System.out.println(b+" is maximum number");

}
}

*/
import mathoperation.Addition; //main program to use all class and methods 
import mathoperation.Maximum;
class mathop{
    public static void main(String args[]){
        Addition addition=new Addition();
        Maximum maximum=new Maximum();
        addition.add(3,5);
        addition.subtract(5,2);
        maximum.max(9,6);
    }
}