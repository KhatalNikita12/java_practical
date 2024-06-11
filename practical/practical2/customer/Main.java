// package customer;
class c1{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        c1 obj=new c1();
        System.out.println(obj.a);
//         System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
