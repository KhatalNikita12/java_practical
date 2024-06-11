import java.io.*;
public class file3 {
    public static void main(String[] args) 
    {
        String fname=args[0];
        int l=0,c=0,w=0;
        try{
            FileReader f=new FileReader(fname);
            BufferedReader b=new BufferedReader(f);
            String line;
            while((line=b.readLine())!=null){
                l++;
                String word[]=line.split("\\s+");
                w+=word.length;
                c+=line.length();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("total number of line "+l);
        System.out.println("total number of character "+c);
        System.out.println("total number of word "+w);
    }
}
