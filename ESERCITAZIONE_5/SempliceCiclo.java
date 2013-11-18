//Per terminare il ciclo bisogna inserire un numero intero < 0 
class SempliceCiclo {
  public static void main(String[] args) {
    int x = 0;
    while (x >= 0) {
      System.out.print("Inserisci un numero intero: ");
      x = Leggi.unInt();
    }
  }
}