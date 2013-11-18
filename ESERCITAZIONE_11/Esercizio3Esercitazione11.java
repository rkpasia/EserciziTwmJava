class Esercizio3Esercitazione11 {
  public static void main(String[] args) {
    char[][] x = new char[6][6];
    riempiMatrice(x,0,x.length,'.');
    riempiMatrice(x,1,5,'$');
    for (int i = 0; i<x.length; i++) {
      for (int j = 0; j<x[i].length; j++)
        System.out.print(x[i][j]+" ");
      System.out.println();
    }
  }
  static void riempiMatrice(char[][] matrice, int riga, int colonna, char carattere){
    for(int i = 0; i < matrice.length; i++){
      for(int j = 0; j < matrice[i].length; j++){
        if(i >= riga && i < colonna && j>= riga && j < colonna){
          matrice[i][j] = carattere;
        }
      }
    }
  }
}