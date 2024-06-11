import java.io.*;
class reversecont{
    public static void main(String args[]){
        try{
            FileInputStream fis=new FileInputStream(args[0]);
             FileOutputStream fos=new FileOutputStream(args[1]);
            int ch;
            // String str=" ";
            while((ch=fis.read())!=-1){
                if(Character.isLowerCase((char)ch)){
                    ch=Character.toUpperCase((char)ch);
                }
                else if(Character.isUpperCase((char)ch)){
                    ch=Character.toLowerCase((char)ch);
                }
              else   if (Character.isDigit((char) ch)) {
                    // Replace digits with '*'
                    ch = '*';
                }
                
                fos.write(ch);
               
            }System.out.print("write data in "+args[1]+" file");
            fos.close();
            fis.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}