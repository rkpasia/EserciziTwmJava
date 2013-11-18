class StampaArrayInvertito {
  public static void main(String[] args) {
    int[] x =  {2,3,4,5};
    System.out.println("L'array x contiene i seguenti elementi:");
    stampaInvertito(x);
  }
  static void stampaInvertito(int[] y){
    String visualizzazioneArray="[";
    for(int i = y.length-1; i >= 0; i--){
      if(i == 0)
        visualizzazioneArray = visualizzazioneArray + y[i];
      else
        visualizzazioneArray = visualizzazioneArray + y[i] + ",";
    }
    System.out.println(visualizzazioneArray+"]");

  }
  static void stampa(int[] y) {
    String visualizzazioneArray="[";
    for(int i = 0; i < y.length; i++){
      if(i == y.length-1)
        visualizzazioneArray = visualizzazioneArray + y[i];
      else
        visualizzazioneArray = visualizzazioneArray + y[i] + ",";
    }
    System.out.println(visualizzazioneArray+"]");
  }
}