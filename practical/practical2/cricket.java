import java.util.Scanner;
class cricket{
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;
    cricket(){

    }
    void accept(String name,int no_of_innings,int no_of_times_notout,int totalruns){
        this.name=name;
        this.no_of_innings=no_of_innings;
        this.no_of_times_notout=no_of_times_notout;
        this.totalruns=totalruns;
    }
    void display(){
        System.out.println(name+"\t\t\t"+no_of_innings+"\t\t\t"+no_of_times_notout+"\t\t\t"+totalruns+"\t\t\t"+bat_avg);
    }
    
    static void avg(cricket a[]){
        for(int i=0;i<a.length;i++){
        a[i].bat_avg=(a[i].totalruns/(a[i].no_of_innings-a[i].no_of_times_notout));
}
    }
    static void sortcricket(cricket a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].bat_avg<a[j].bat_avg){
                    cricket temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("how many number");
        int n=input.nextInt();
       cricket cp[]=new cricket[n];
        System.out.println("enter player details");
        for(int i=0;i<n;i++){
           cp[i]=new cricket();
            System.out.println("enter "+(i+1)+" player details");
            input.nextLine();
            System.out.println("enter name ");
            String nm=input.nextLine();
            System.out.println("enter number of innings");
            int ni=input.nextInt();
            System.out.println("enter number of times not out");
            int nout=input.nextInt();
            System.out.println("enter total runs");
            int tr=input.nextInt();
           cp[i].accept(nm,ni,nout,tr);
        //   cricket cp[i]=new cricket(nm,ni,nout,tr);

        }
        
        System.out.println("\t\tdisplay player detail in original order");
        System.out.println("name \t\t no_of_innings \t\t no_of_times_notout \t\t totalruns \t\tbating average");
       
        cricket.avg(cp);
            for(int i=0;i<n;i++){
            cp[i].display();
            }
             System.out.println("\t\tdisplay player detail in After sorting ");
        System.out.println("name \t\t no_of_innings \t\t no_of_times_notout \t\t totalruns \t\tbating average");
        cricket.sortcricket(cp);
            for(int i=0;i<n;i++){
                cp[i].display();
            }
        }
    }
