class Nodo {
  private int elemento;
  private Nodo successivo;

  public Nodo(){
    this(0,null);
  }
  
  public Nodo(int elemento, Nodo successivo){
    this.elemento = elemento;
    this.successivo = successivo;
  }

  public int getElemento(){
    return elemento;//QUI CI RIFERIAMO ALL'ISTANZA QUINDI NON SERVE IL THIS
  }

  public Nodo getSuccessivo(){
    return successivo;//QUI CI RIFERIAMO ALL'ISTANZA QUINDI NON SERVE IL THIS
  }

  public void setElemento(int elemento){
    this.elemento = elemento;
  }

  public void setSuccessivo(Nodo successivo){
    this.successivo = successivo;
  }

}