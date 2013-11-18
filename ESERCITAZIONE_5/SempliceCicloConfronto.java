//Per terminare il ciclo, il primo numero inserito deve essere maggiore del secondo.
class SempliceCicloConfronto {
  public static void main(String[] args) {
    int x = 0, y = 1;
    while (x<y) {
      System.out.print("Inserisci due numeri interi:\n1- ");
      x = Leggi.unInt();
      System.out.print("2- ");
      y = Leggi.unInt();
    }
  }
}