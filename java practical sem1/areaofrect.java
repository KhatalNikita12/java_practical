interface shape{
    abstract void  area();
}
class rectangle implements shape{
    double l;
    double b;
    rectangle(double l,double b){
        this.l=l;
        this.b=b;

    }
    public void area(){
        System.out.println("area of rectangle is:"+l*b);
    }
}
class areaofrect{
    public static void main(String args[]){
        rectangle r=new rectangle(2,4);
        r.area();
    }
}