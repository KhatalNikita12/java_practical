import java.util.Scanner;
class InvalidProductException extends Exception{
    InvalidProductException(String s){
        super(s);
    }
}
class productInfo{
    int productcode;
    String prodname;
    int weight;
    productInfo( int productcode,String prodname,int weight){
        this.productcode=productcode;
        this.prodname=prodname;
        this.weight=weight;
    }
    void display(){
        System.out.println(productcode+"\t\t"+prodname+"\t\t"+weight);
    }

}
class product{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter product code");
        int pc=input.nextInt();
        System.out.println("enter product name");
        input.nextLine();
        String pn=input.nextLine();
        System.out.println("enter product weight");
        int pw=input.nextInt();
        try{
            if(pw>100)
                throw new InvalidProductException("weight is more than 100");
            productInfo pI=new productInfo(pc,pn,pw);
            System.out.println("productcode \t productname \t weight");
            pI.display();
        }
        catch(Exception e){
           System.out.println("Exception occurs:"+e);
        }
    }
}