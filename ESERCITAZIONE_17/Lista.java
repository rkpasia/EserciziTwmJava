class Lista {
    
    private Nodo primo;      // riferimento al primo nodo della lista
    private Nodo ultimo;     // riferimento all'ultimo nodo della lista
    private int lunghezza;   // numero di elementi inseriti nella lista

    public Lista() {
      primo = null;
      ultimo = null;
      lunghezza = 0;
    }

    public Lista(Lista l){
      this.primo = l.primo;
      this.ultimo = l.ultimo;
      this.lunghezza = l.lunghezza;
    }

    public Lista(int[] array){
      for(int i = 0; i < array.length; i++){
        if(i == 0){
          inserisciPrimo(array[i]);
        }else{
          inserisciUltimo(array[i]);
        }
      }
    }

    // verifica se la lista e' vuota
    public boolean vuota(){
      return lunghezza == 0;
    }

    public int lunghezza(){
      return lunghezza;
    }

    public int getPrimoElemento(){
      return primo.getElemento();
    }

    public int getUltimoElemento(){
      return ultimo.getElemento();
    }

    // Inserisce un nuovo elemento nella lista al primo posto
    public void inserisciPrimo(int elemento){
      primo = new Nodo(elemento,primo);
      if (vuota())
        ultimo = primo;
      lunghezza++;
    }

    // Inserisce un nuovo elemento nella lista in ultima posizione
    public void inserisciUltimo(int elemento){
      if (vuota())
        inserisciPrimo(elemento);
      else {
        ultimo.setSuccessivo(new Nodo(elemento,null));
        ultimo = ultimo.getSuccessivo();
        lunghezza++;
      }
    }
 
    public String toString(){
      Nodo indice = this.primo;
      String s = "";
      while(indice != this.ultimo){
        s = s + indice.getElemento();
        indice = indice.getSuccessivo();
      }
      return s + indice.getElemento();
    }

    public int elementoIn(int i){
      Nodo indice = this.primo;
      for(int j = 1; j <  i; j++){
        indice = indice.getSuccessivo();
      }
      return indice.getElemento();
    }

    public void appendi(Lista l){
      this.ultimo.setSuccessivo(l.primo);
      this.ultimo = l.ultimo;
      this.lunghezza = this.lunghezza + l.lunghezza;
    }

    public void pop(){
      Nodo indice = this.primo;
      for(int i = 0; i < this.lunghezza-1; i++){
        if(indice.getSuccessivo() == this.ultimo){
          indice.setSuccessivo(null);
          this.ultimo = indice;
        }else{
          indice = indice.getSuccessivo();
        }
      }
    }

  }