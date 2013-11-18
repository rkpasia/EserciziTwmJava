class SommaDiNumeri {
  public static void main(String[] args) {
    final int tot = 10;
    int somma = 0;
    int numero;
    int contatore = 1;
    System.out.println("Inserisci "+tot+" numeri da sommare: ");
    while(contatore <= tot) {
        System.out.print(contatore+"? ");
        numero = Leggi.unInt();
        somma = somma + numero;
        contatore = contatore + 1;
    }
    System.out.println("La somma dei "+tot+" numeri e': "+somma);
  }
}