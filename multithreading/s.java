class first{
    public void display(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.print("]");
    }
}
class second extends Thread{
    String msg;
    first fobj;
    second(first fobj,String msg){
        this.fobj=fobj;
        this.msg=msg;
        start();
    }
    public void run(){
        synchronized(fobj){
            fobj.display(msg);
        }
    }
}
public class s {
public static void main(String[] args) {
    first fnew=new first();
    second s1=new second(fnew, "welcome");
    second s2=new second(fnew, "new");
    second s3=new second(fnew, "programmer");
}
    
}