public class genericsdemo <T,U>{
    T obj1;
    U obj2;

    genericsdemo( T obj1,U obj2){
this.obj1=obj1;
this.obj2=obj2;
    }
    void display(){
        System.out.println(obj1);
        System.out.println(obj2);

    }
    public static void main(String[] args) {
        genericsdemo<String,Integer> gd=new genericsdemo<String,Integer>("NIKITA", 20);
        gd.display();
    }
}
