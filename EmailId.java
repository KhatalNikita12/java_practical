class invalidpasswordException extends Exception{
    invalidpasswordException(String s){
        super(s);
    }
}
public class EmailId {
    String username,password;
    EmailId(){
        username="Admin";
        password="pass123";
    }
    EmailId(String username,String password){
        this.username=username;
        this.password=password;
    }
    public static void main(String[] args) {
        EmailId e1=new EmailId();
        EmailId e2=new EmailId(args[0],args[1]);
        String s1=e1.username;
        String s2=e1.password;
        String s3=e2.username;
        String s4=e2.password;
        try{
            if(s1.equals(s3)){
                System.out.println("user name is correct");
            }
             else{
                throw new invalidpasswordException("invalid username ");
            }
           if(s2.equals(s4)){
                System.out.println("password is correct");
            }
           else{
                throw new invalidpasswordException("invalid password");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
