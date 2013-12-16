class CreaStampaArrayChar {
	public static void main(String[] args){
		System.out.print("Inserisci la lunghezza dell'array da azzerare:");
		char[] array = new char[Leggi.unInt()];
		System.out.print("Leggi un carattere con cui riempire l'array:");
		char carattere = Leggi.unChar();
		azzeraArray(array,carattere);
		stampa(array);
	}
	static void azzeraArray(char[] array, char carattere){
		for(int i = 0; i < array.length; i++){
			array[i] = carattere;
		}
	}
	static void stampa(char[] y) {
    	String visualizzazioneArray="[";
	    	for(int i = 0; i < y.length; i++){
	      	if(i == y.length-1)
	        	visualizzazioneArray = visualizzazioneArray + y[i];
	      	else
	        	visualizzazioneArray = visualizzazioneArray + y[i] + ",";
    	}
    System.out.println("L'array e':" + visualizzazioneArray+"]");
  }

}