import java.util.Scanner;
interface maker{

}
class product implements maker{
    int id;
    String name;
    double cost;
    int quantity;
    static int  cnt;
    product(){
        // id=1;
        // name="notebook";
        // cost=60;
        // quantity=6;
        // cnt++;
        // System.out.println("object "+cnt+" created");
    }
   product(  int id,String name, double cost,int quantity){
this.id=id;
this.name=name;
this.cost=cost;
this.quantity=quantity;
cnt++;
System.out.println("object "+cnt+" created");
    }
    public String toString(){
        return id+"\t"+name+"\t\t"+cost+"\t\t"+quantity;
    }

}
class productobject{
    public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            System.out.println("enter how many number");
            int n=input.nextInt();
            product p[]=new product[n];
            for(int i=0;i<n;i++){
            
                System.out.println("enter id ,product_name, product_cost, product_quantity ");
                int id1=input.nextInt();
                input.nextLine();
                String nm=input.nextLine();
                double c=input.nextDouble();
                int q=input.nextInt();
                p[i]=new product(id1,nm,c,q);
            }
            //  product p1=new product();
            System.out.println("display detail");
            System.out.println("id\tproductname\tproductcost\tquantity");
            for(int i=0;i<n;i++){
                System.out.println(p[i]);
                // System.out.println(p1);
            }
           
    }
}