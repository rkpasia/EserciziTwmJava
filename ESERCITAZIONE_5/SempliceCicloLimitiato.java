//Per terminare il ciclo bisogna inserire un numero intero minore di - 22 e maggiore di 12
class SempliceCicloLimitato {
  public static void main(String[] args) {
    int x = 0;
    while ((x >= -22)&&(x <= 12)) {
      System.out.print("Inserisci un numero intero: ");
      x = Leggi.unInt();
    }
  }
}