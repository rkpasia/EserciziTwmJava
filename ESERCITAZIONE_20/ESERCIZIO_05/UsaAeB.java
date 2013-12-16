public class UsaAeB {
  public static void main(String args[]){
    B b1 = new B(4,5);
    A a = b1.copia();
    System.out.println(a.getX());
    B b2 = (B)b1.copia();
    System.out.println(b2.getX());
  }  
}