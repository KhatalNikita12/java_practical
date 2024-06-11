import java.util.*;
public class names {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many names");
        int n=input.nextInt();
        input.nextLine();
        ArrayList al=new ArrayList<>();
        System.out.println("enter name");
        for(int i=0;i<n;i++){
            al.add(input.nextLine());
        }
        System.out.println("name in original order"+al);
        // TreeSet tname=new TreeSet<>(al);
        // System.out.println("name in ascending order"+tname);
      
        al.clear();
        System.out.println("after deleting"+al);
    }
}
