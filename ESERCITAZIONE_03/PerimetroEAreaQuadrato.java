/* Programma che legge in input un intero che assumiamo sia il lato di un ipotetico quadrato. Restituirà in output il perimetro e l'area del quadrato. */
class PerimetroEAreaQuadrato{
	public static void main(String[] args){
		int lato;
		lato = Leggi.unInt(); /* Opzionalmete sarebbe da aggiungere anche un controllo per verificare la positività dell'intero in input */
		System.out.println("Il perimetro del quadrato è: "+lato*4+"\nL'area del quadrato è: "+lato*lato);
	}
}