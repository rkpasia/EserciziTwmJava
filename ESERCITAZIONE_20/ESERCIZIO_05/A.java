public class A {
  private int x;

  public A(int x){
    this.x = x;
  }
  
  public A copia(){
    return  new A(x);
  }
  
  public int getX(){
    return x;
  }
}