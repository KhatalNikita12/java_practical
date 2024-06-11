import java.io.*;
public class file1 {
    public static void main(String[] args) throws Exception
     {
        try{
        FileInputStream fis=new FileInputStream(args[0]);
        //  FileOutputStream fos=new FileOutputStream(args[1]);
         int ch;
         while((ch=fis.read())!=-1){
            System.out.print((char)ch);
            // fos.write(ch);
         }
       
        fis.close();
        //  fos.close();
         
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
