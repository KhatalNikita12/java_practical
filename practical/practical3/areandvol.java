import java.util.Scanner;
interface operation{
    void area();
    void volume();
    final float pi=3.142f;

}
 class Cylinder  implements operation{
    double r;
     double h;
     Cylinder(double r,double h){
        this.r=r;
        this.h=h;
 }
 public void area(){
    System.out.println("area of cylinder is "+((2*pi*r*h)+(2*pi*r*r)));
 }
 public void volume(){
     System.out.println("volume of cylinder is "+pi*r*r*h);
 }
 }
 class areandvol{
    public static void main(String args[]){
        Cylinder c=new Cylinder(2,5);
        c.area();
        c.volume();
    }
 }