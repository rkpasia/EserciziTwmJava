/*class A1 {
  protected int x;
  public A1(int x) {
    this.x = x;
  }
}
class B1 extends A1 {
  public B1(int x) {
    super(x);
  }
}*/

/*class A1 {
  protected int x;
  public A1() {
    this.x = 3;
  }
}
class B1 extends A1 {
  public B1(int x) {
  	super();
  }
}*/

class A extends B {
  protected int x;
  public A(int x, int y) {
  	super("Costruttore di A");
  }
}
class B{
  public B(String s) {
  	System.out.println("Costruttore di B "+s);
  }
}