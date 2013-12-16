//INFORMAZIONE GITHUB - SE VOLETE VEDERE GLI ESERCIZI DAL 4.6 AL 4.9 ANDATE A https://github.com/rkpasia/EserciziTwmJava/tree/master/ESERCITAZIONE_04
//QUI TROVERETE TUTTI GLI ESERCIZI DEL CORSO, ANCHE QUELLI CHE NON POTEVANO ESSERE INSERITI


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