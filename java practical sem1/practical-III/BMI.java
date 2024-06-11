/*Write a program to read the First Name and Last Name of a person, his weight and height using 
command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
divided by the square of their height. (Hint : BMI = Wts. In kgs / (ht)2) */
class BMI{
    public static void main(String args[]){
        String fname=args[0];
        String lname=args[1];
        double weight=Double.parseDouble(args[2]);
        double height=Double.parseDouble(args[3]);
        double temp=height;
        height=height/100;
        double BMI=weight/(height*height);
       System.out.println("firstname \t lastname \t weight \t height");
        System.out.println(fname+"\t\t"+lname+"\t\t"+weight+"\t\t"+temp);
         System.out.println("Body mass index (BMI) is:"+BMI);
    }
}