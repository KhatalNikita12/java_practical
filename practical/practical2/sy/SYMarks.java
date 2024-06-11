package sy;
public class SYMarks{
  public  int comptotal;
  public  int mathtotal;
 public   int eletotal;
  public  SYMarks(  int comptotal,int mathtotal,int eletotal){
    this.comptotal=comptotal;
    this.mathtotal=mathtotal;
    this.eletotal=eletotal;
  }
  public String toString(){
    return comptotal+"\t\t"+mathtotal+"\t\t"+eletotal;
  }
}