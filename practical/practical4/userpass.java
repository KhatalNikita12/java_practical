class invalidusername extends Exception{
    String msg="Invalid username";
    public String toString(){
        return msg;
    }
}
class invalidpass extends Exception{
    String msg="Invalid password";
    public String toString(){
        return msg;
    }
}
class Emailid{
    String username;
     String pass;
     Emailid(){
        username="user";
        pass="pass123";
     }
     Emailid(    String username,String pass){
        this.username=username;
        this.pass=pass;
     }
}
class userpass{
    public static void main(String args[]){
        Emailid e1=new Emailid(args[0],args[1]);
        Emailid e2=new Emailid();
        String s1=e1.username;
        String s2=e2.username;
          String s3=e1.pass;
        String s4=e2.pass;
        try{
            if(s1.equals(s2)){
                System.out.println("username matched");
            }
            else 
            throw new invalidusername();
            
        }
        catch (Exception e){
                System.out.println(e);
            }
        
          try{
            if(s3.equals(s4)){
                System.out.println("password matched");
            }
            else 
            throw new invalidpass();
            
        }
        catch (Exception e){
                System.out.println(e);
            }
    }
}
