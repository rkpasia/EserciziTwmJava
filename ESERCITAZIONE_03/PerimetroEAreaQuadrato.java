/* Programma che legge in input un intero che assumiamo sia il lato di un ipotetico quadrato. Restituira' in output il perimetro e l'area del quadrato. */
class PerimetroEAreaQuadrato{
	public static void main(String[] args){
		int lato = Leggi.unInt(); /* Opzionalmete sarebbe da aggiungere anche un controllo per verificare la positivita' dell'intero in input */
		System.out.println("Il perimetro del quadrato e': "+lato*4+"\nL'area del quadrato e': "+lato*lato);
	}
}