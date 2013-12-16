public class Scacchiera {
  
  private static final int DIMENSIONE_DEFAULT = 3;   // DIMENSIONE DI DEFAULT DELLA SCACCHIERA 

  private char vuoto;
  private char[][] cella;
  private int dimensione;

  public Scacchiera(char car) {
    this(DIMENSIONE_DEFAULT, car);
  }

  public Scacchiera(int dim, char car) {

    dimensione = dim;
    vuoto = car;
    // Crea una matrice quadrata di dimensione dim
    // e inizializza gli elementi col carattere car
    cella = new char[dimensione][dimensione];
    for(int i = 0; i < cella.length; i++){
      for(int j = 0; j < cella[i].length; j++){
        cella[i][j] = car;
      }
    }

  }

  public int getDimensione() {
    return dimensione;
  }


  // restituisce il carattere contenuto nella cella (x,y)
  public char cella(int x, int y) {
    return cella[x][y];
  }

  // restituisce una stringa in cui e rappresentata la scacchiera
  public String toString() {
     String s = "";
     for(int i = 0; i < cella.length; i++){
      s = s + disegnaLinea();
      for(int j = 0; j < cella[i].length; j++){
        if(j == cella[i].length-1){
          s = s + "| "+cella[i][j]+" |\n";
        }else{
          s = s + "| "+cella[i][j]+" ";
        }
      }
     }
     s = s + disegnaLinea();
     return s;
  }

  // Viene utilizzato dal metodo toString
  private String disegnaLinea() {
    String s = "";
    for (int i = 0; i < 4 * dimensione + 1; i++)
      s += "-";
    s += "\n";
    return s;
  }

  public boolean mettiIn(int x, int y, char car){
    if((x>cella.length)||(y>cella[0].length)||(cella[x][y]!=' ')){
      return false;
    }else{
      cella[x][y] = car;
      return true;
    }
  }

}