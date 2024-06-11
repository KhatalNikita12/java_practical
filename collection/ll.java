import java.io.*;
import java.util.*;
class ll{
    public static void main(String[] args) {
        try{
            File f=new File(args[0]);
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            LinkedList ll=new LinkedList();
            String line="";
            while((line=br.readLine())!=null){
                ll.add(line);
                System.out.println("content write in ll");
            }
            System.out.println(ll);
            ll.add("hello good morning");
            Iterator itr=ll.iterator();
            FileOutputStream fos=new FileOutputStream(args[0],true);
            while(itr.hasNext()){
                String l1=(String)itr.next();
                byte b[]=l1.getBytes();
                fos.write(b);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}