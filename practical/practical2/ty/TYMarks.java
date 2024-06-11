package ty;
public class TYMarks{
  public  int theory;
  public  int practical;

  public  TYMarks(  int theory,int practical){
    this.theory=theory;
    this.practical=practical;
   
  }
  public String toString(){
    return theory+"\t\t"+practical;
  }
}