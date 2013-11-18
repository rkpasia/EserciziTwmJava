public class Azzera {
	public static void main(String[] args){
		int x;
		x = 1;
		System.out.println(x);
		azzera(x);
		System.out.println(x);
	}  
	static void azzera(int x){
		x = 0;
	}
}

/* L'output del programma sara' sempre 1 perche' il metodo e' una procedura e non modifica permanentemente i dati che riceve come 
parametri attuali. */