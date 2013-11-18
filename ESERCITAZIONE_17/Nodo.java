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
    return elemento;
  }

  public Nodo getSuccessivo(){
    return successivo;
  }

  public void setElemento(int elemento){
    this.elemento = elemento;
  }

  public void setSuccessivo(Nodo successivo){
    this.successivo = successivo;
  }

}