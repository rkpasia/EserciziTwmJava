public class PilaInteriLimitata {
  private int[] pila;
  private int top = 0;

  public PilaInteriLimitata(int max) {
    this.pila = new int[max];
  }
  public boolean vuota(){return top <= 0;}
  public boolean piena(){return top > pila.length-1;}
  public int estrai() throws EccezionePilaVuota {
    //if (vuota()) {
    //  throw new EccezionePilaVuota("Errore: la pila e' vuota");
    //}
    return pila[(top--)-1];
  }
  public void metti(int x) throws EccezionePilaPiena {
    //if (piena()) {
    //  throw new EccezionePilaPiena("Errore: la pila e' piena");
    //}
    pila[top++] = x;
  }
}