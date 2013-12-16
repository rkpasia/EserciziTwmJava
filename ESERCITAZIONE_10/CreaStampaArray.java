class CreaStampaArray {
	public static void main(String[] args){
		System.out.print("Inserisci la lunghezza dell'array da azzerare:");
		int[] array = new int[Leggi.unInt()];
		azzeraArray(array);
		stampa(array);
	}
	static void azzeraArray(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = 0;
		}
	}
	static void stampa(int[] y) {
    	String visualizzazioneArray="[";
	    	for(int i = 0; i < y.length; i++){
	      	if(i == y.length-1)
	        	visualizzazioneArray = visualizzazioneArray + y[i];
	      	else
	        	visualizzazioneArray = visualizzazioneArray + y[i] + ",";
    	}
    System.out.println("L'array azzerato e':" + visualizzazioneArray+"]");
  }

}