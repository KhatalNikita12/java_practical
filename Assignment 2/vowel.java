import java.util.Scanner;
class vowel{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
            // input.nextLine();
            int cnt=0;
            String str=input.nextLine();
            for(int i=0;i<str.length();i++){
            char word=str.charAt(i);
            if(word=='a' || word=='e' || word=='i' ||word=='o' ||word=='u'){
                cnt++;
            }
            }
            System.out.println("count is "+cnt);
            
    }
}