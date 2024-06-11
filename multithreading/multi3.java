class multi3 implements Runnable{  
    multi3(){
    Thread t=new Thread(this);
        t.start();
    }
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    multi3 m1=new multi3();  
    // Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  

    // m1.start();  
     }  
    }