import java.io.FileInputStream;

public class reverse {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream(args[0]);
            int ch;
            String str=" ";
            while((ch=fis.read())!=-1){
                str+=(char)ch;
              if(Character.isUpperCase(ch))
               System.out.print(Character.toLowerCase((char)ch));
               if(Character.isLowerCase(ch))
               System.out.print(Character.toUpperCase((char)ch));
            }
            StringBuffer sb=new StringBuffer(str);
            System.out.println(sb.reverse());
             
            fis.close();
            }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
