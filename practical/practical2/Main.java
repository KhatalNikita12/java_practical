class Main{
    public static void main(String args[]){
        if(args.length==5){
            int a[]=new int[5];
            for (int i=0;i<5;i++){
                a[i]=Integer.parseInt(args[i]);
            }

            for (int i=0;i<5;i++){
                for (int j=i+1;j<5;j++){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }

                }
                  }
                System.out.println("After sorting ele");
                for(int i=0;i<5;i++){
                    System.out.print(a[i]+"\t");
                }
          
            }
        System.out.println("invalid");

    }
}