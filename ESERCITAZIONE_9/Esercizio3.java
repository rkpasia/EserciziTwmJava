class Esercizio3 {
  public static void main(String[] args) {
    int n = inputIntero("Inserisci un numero intero");
    //System.out.println("Il numero inserito e': "+n);
    double d = inputDouble("Inserisci un double");
    for(int i = 1; i <= n; i++){
    	System.out.println(d);
    }
  }
  static int inputIntero(String messaggio) {
    System.out.print(messaggio+" ");
    return Leggi.unInt();
  }

  static double inputDouble(String messaggio) {
    System.out.print(messaggio+" ");
    return Leggi.unDouble();
  }
}