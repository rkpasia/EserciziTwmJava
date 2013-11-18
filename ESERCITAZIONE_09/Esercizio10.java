class Esercizio10 {
	public static void main(String[] args){
		System.out.print("Inserisci un numero: ");
	    int n = Leggi.unInt();
	    if (pari(n))
	      System.out.println("Il numero inserito e' pari");
	    else
	      System.out.println("Il numero inserito e' dispari");
	}
	static boolean pari(int numero){
		return numero%2==0;
	}
	static boolean dispari(int numero){
		return numero%3==0;
	}
}