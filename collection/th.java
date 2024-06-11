public class th extends Thread {
 int n;
 String  str;
 public th(String  str,int n) {
        this.n = n;
        this.str = str;
    }
 public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(getName()+ ": " + str);
            try {
         Thread.sleep(100);
            } 
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
       th t1=new th("COVID19",10);
       th t2=new th("LOCKDOWN2020",20);
       th t3=new th("VA",30);
       t1.start();
       t2.start();
       t3.start();
    }
}
