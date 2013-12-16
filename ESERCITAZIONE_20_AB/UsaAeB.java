public class UsaAeB {
  public static void main(String args[]){
    B b1 = new B(4,5);
    A a = b1.copia();
    System.out.println(a.getX());
    B b2 = (B)b1.copia();// C'e' un problema di casting, una istanza di A non può essere castata a B perche' e' la sopraclasse di essa.
    System.out.println(b2.getX());
  }  
}