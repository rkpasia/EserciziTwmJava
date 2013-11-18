//Per terminare il ciclo bisogna inserire un numero intero > 22 
class SempliceCiclo22 {
  public static void main(String[] args) {
    int x = 0;
    while (x <= 22) {
      System.out.print("Inserisci un numero intero: ");
      x = Leggi.unInt();
    }
  }
}