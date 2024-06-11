import java.util.*;

public class a {
   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    Scanner inp=new Scanner(System.in);
    System.out.println("enter how many no");
    int n=inp.nextInt();
    inp.nextLine();
    for(int i=0;i<n;i++){
        System.out.println("enter "+(i+1)+" student name");
        ll.add(inp.nextLine());
    }
Iterator itr=ll.iterator();
System.out.println("display student");
while(itr.hasNext()){
    System.out.println(itr.next());
}
}
}
