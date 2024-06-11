public class twosec extends Thread {
    public static void main(String[] args) {
        
    
    try{
    for(char i='A';i<='Z';i++){
        System.out.print(i+"\t");
        Thread.sleep(500); 
    }
}
    catch(Exception e){
        System.out.println(e);
    }
    }
}
