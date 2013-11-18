class Esercizio8 {

  static int m1(int x) {
    System.out.println("Metodo m1. Paramtro: " + x);
  }
    
  public static void main(String[] args) {
    int a;
    int b;
    boolean p;
    double x;
    a = 2;
    p = true;
    x = 2.0;
    m1(a);
    b = m1(a);
    m1(b);
    m1(p); //Errore il metodo si aspetta un int non un boolean
    m1(x); //Errore il metodo si aspetta un int e viene inviato un double, non si possono fare cast impliciti durante le chiamate dei metodi solo se effettivamente scritto (int)x funzionerebbe forzando il cast
  }
}