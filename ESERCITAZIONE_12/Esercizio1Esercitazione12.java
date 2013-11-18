class Esercizio1Esercitazione12 {
  public static void main(String[] args) {
    int[] x = {1,2,3,4};
    System.out.println("array x: "+arrayToString(x));
    scambiaElementi(x,0,1);
    System.out.println("array x dopo lo scambio dei primi "+
                       "due elementi: "+arrayToString(x));
    scambiaElementi(x,1,3);
    System.out.println("array x dopo lo scambio dell'elemento "+
                       "di indice 1 con l'elemento di indice "+
                       "3: "+arrayToString(x));
  }

  /**
   * Funzione che restituisce in forma di stringa un 
   * array. 
   */
  static String arrayToString(int[] a) {
    String temp = "[";
    temp = temp + arrayToString(a,0);
    return temp+"]";
  }

  /**
   * Metodo ricorsivo che restituisce una stringa con
   * gli elementi dell'array separati da una virgola.
   */
  static String arrayToString(int[] a, int i) {
    String temp = "";
    if (i == a.length-1)
      temp = temp + a[i];
    else if (i < a.length-1 && i>=0)
      temp = temp + a[i] + "," + arrayToString(a,i+1);
    return temp;
  }

  static void scambiaElementi(int[] matrice, int indiceUno, int indiceDue){
    int valoreSpostato;
    valoreSpostato = matrice[indiceUno];
    matrice[indiceUno] = matrice[indiceDue];
    matrice[indiceDue] = valoreSpostato;
  }
}