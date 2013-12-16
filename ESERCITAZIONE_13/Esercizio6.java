class Esercizio6 {

  public static void main(String[] args){
    System.out.print("Inserisci la dimensione del vettore: ");
    int n = Leggi.unInt();
    int[] v = crearRandomArray(n);
    System.out.print("Inserisci il numero da cercare: ");
    int m = Leggi.unInt();
    System.out.println("Il programma ha generato il seguente vettore: ");
    stampaArray(v);
    System.out.println("L'indice dell'elemento ? "+dicotomicSearch(0, v.length-1, v, m));
  }
  
  static int[] crearRandomArray(int n){
    int[] v = new int[n];
    for (int i=0; i < v.length; i++)
      v[i] = (int)(Math.random()*10);
    return(v);
  }
  
  static void stampaArray(int[] v){
    for(int i = 0; i < v.length; i++){
      System.out.print(v[i]+" ");
    }
    System.out.println();
  }
  
  static int dicotomicSearch(int startIndex, int endIndex, int[] v, int number){
    if(startIndex == endIndex){
      return v[startIndex] == number ? startIndex : -1;
    }else{
      return Math.max(dicotomicSearch(startIndex,(startIndex+endIndex)/2,v,number),dicotomicSearch((startIndex+endIndex)/2+1,endIndex,v,number));
    }
  }
  
}
