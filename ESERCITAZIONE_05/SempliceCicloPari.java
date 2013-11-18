//Per terminare il ciclo bisogna inserire un numero intero pari
class SempliceCicloPari {
  public static void main(String[] args) {
    int x = 1;
    while (x%2 != 0) {
      System.out.print("Inserisci un numero intero: ");
      x = Leggi.unInt();
    }
  }
}