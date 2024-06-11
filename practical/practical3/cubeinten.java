
interface function{
    void cube(int n);
    void sqr(int n);
}
class demo implements function{
    public void cube(int n){
      System.out.println("cube is "+(n*n*n));
    }
     public void sqr(int n){
      System.out.println("square is "+(n*n));
    }
}
class cubeinten{
    public static void main(String args[]){

    demo d=new demo();
    d.cube(2);
    d.sqr(2);
}
}