class table{
    public static void main(String args[]){
        System.out.println("table from 1 to 15");
        for(int i=1;i<=10;i++){
            for(int j=1;j<=7;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t\t");
            }
            System.out.println();
        }
    }
}