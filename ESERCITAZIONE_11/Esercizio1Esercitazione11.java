class Esercizio1Esercitazione11 {
  public static void main(String[] args) {
    char[][] y1 = {{'a','b','c'},{'x','r','t'}};
    char[][] y2 = {{'1','2'},{'a','b'},{'3','r'}};
    System.out.println(matriceToString(y1));
    System.out.println(matriceToString(y2));
  }
 
  static String matriceToString(char[][] m) {
    String temp = "";
    for (int i = 0; i<m.length; i++) {
      for (int j= 0; j<m[i].length; j++){
        temp += (j == m[i].length-1) ? m[i][j] : m[i][j] + "-" ;
      }
      temp += "\n";
    }
    return temp;
  }

}
