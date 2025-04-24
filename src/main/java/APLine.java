public class APLine
{
  /* your code here */
  private int myA;
  private int myB;
  private int myC;
  public APLine(int a, int b, int c){
    myA = a;
    myB = b;
    myC = c;
  }
  public double getSlope(){
    return (-(double)myA)/myB;
  }
  public boolean isOnLine(int x, int y){
    return myA*x + myB*y + c == 0;
  }
  
}
