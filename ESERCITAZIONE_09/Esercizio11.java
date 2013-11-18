class Esercizio11 {
	public static void main(String[] args){
		System.out.print("Inserisci un numero: ");
	    int n = Leggi.unInt();
	    if (dispari(n))
	      System.out.println("Il numero inserito e' dispari");
	    else
	      System.out.println("Il numero inserito e' pari");
	}
	static boolean pari(int numero){
		return numero%2==0;
	}
	static boolean dispari(int numero){
		return !pari(numero);
	}
}