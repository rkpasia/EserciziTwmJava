public class B extends A {
  private int x;
  
  public B(int x1, int x2){
    super(x1);
    x = x2;
  }
  
  public int getX(){
    return x;
  }
}