    class new1{
    public static void main(String args[])
    {
        System.out.println("FIRST NAME OF PERSON:");
        String First_name=args[0];
        System.out.println("LAST NAME OF PERSON:");
        String Last_name=args[1];
        System.out.println("WEIGHT IS:");
        int weight=Integer.parseInt(args[2]);
        System.out.println("HEIGHT IS:");
        int height=Integer.parseInt(args[3]);
        
        double bmi=weight/(height*height);
        System.out.println("BMI OF "+First_name+" "+Last_name+" is:"+bmi);
    }//
}