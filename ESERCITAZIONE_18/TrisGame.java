public class TrisGame {

  public static final char TURNOX = 'X'; 
  public static final char TURNO0 = '0';
  public static final char VUOTA = ' ';
  public static final char NESSUNO = 'N';

  private char vincitore;  // puo' assumere i valori 'X, '0' o 'N'
  private int numeroMosse; // indica il numero di mosse fatte
  private Scacchiera sc;
  private boolean turnoX;  // true per 'X'

  public TrisGame() {
    vincitore = NESSUNO;
    numeroMosse = 0;
    turnoX = true;
    sc = new Scacchiera(VUOTA);
  }


  public char getVincitore() {
    return vincitore;
  }


  public int getNumeroMosse(){
    return numeroMosse;
  }


  public boolean massimoMosse() {
    // restituisce true se e' stato fatto il numero massimo di mosse disponibili
    // in una partita
    return numeroMosse == 9;
  }

  
  private char getTurno() {
    return (turnoX)? TURNOX : TURNO0;
  }


  public boolean nessunVincitore(){
    return (vincitore == NESSUNO);
  }

  public boolean mossa(){
    char turno = this.getTurno();
    System.out.println("E' il turno di "+turno+" inserisci da tastiera dove inserire la "+turno);
    System.out.print("Coordinate x: ");
    int x = Leggi.unInt();
    System.out.print("Coordinate y: ");
    int y = Leggi.unInt();
    if(this.sc.mettiIn(x,y,turno)){
      turnoX = !turnoX;
      numeroMosse++;
      return true;
    }else{
      return false;
    }
  }

  private boolean vincitoreDiagonale1() {
    char test = sc.cella(0, sc.getDimensione() - 1);
    if (test == VUOTA)
      return false;
    for (int i = 1; i < sc.getDimensione(); i++)
      if (test != sc.cella(i, sc.getDimensione() - 1 - i))
        return false;
    vincitore = test;
    return true;
  }

  private boolean vincitoreDiagonale2() {
    char test = sc.cella(0,0);
    if (test == VUOTA)
      return false;
    for (int i = 1; i < sc.getDimensione(); i++)
      if (test != sc.cella(i, i))
        return false;
    vincitore = test;
    return true;
  }

  private boolean vincitoreColonna(int col) {
    char verifica = sc.cella(0,col);
    if(verifica == VUOTA){
      return false;
    }else{
      for(int i = 1; i < sc.getDimensione(); i++){
        if(verifica != sc.cella(i,col)){
          return false;
        }
      }
      vincitore = verifica;
      return true;
    }
  }

  private boolean vincitoreRiga(int riga) {
    char verifica = sc.cella(riga,0);
    if(verifica == VUOTA){
      return false;
    }else{
      for(int i = 1; i < sc.getDimensione(); i++){
        if(verifica != sc.cella(riga,i)){
          return false;
        }
      }
      vincitore = verifica;
      return true;
    }
  }

  public void setVincitore(){
    boolean vittoria; // 
    if(vincitoreDiagonale1()){

    }else if(vincitoreDiagonale2()){

    }else{
      for(int i = 0; i < sc.getDimensione(); i++){
        vittoria = vincitoreRiga(i);
        if(vittoria) break;
        vittoria = vincitoreColonna(i);
        if(vittoria) break;
      }
    }
  }

  public String toString(){
    String s = "";
    s += sc.toString();
    s += "\nNumero mosse: "+numeroMosse;
    return s;
  }

}