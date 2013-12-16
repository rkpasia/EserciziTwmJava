class Esercizio12 {
	public static void main(String[] args){
		System.out.println("Inserisci un numero di primi che vuoi inserire in un array:");
		int numeroPrimi = Leggi.unInt();
		int[] arrayPrimi = new int[numeroPrimi];
		riempiArray(arrayPrimi);
	}
	static boolean pari(int numero){
		return numero%2==0;
	}
	static boolean dispari(int numero){
		return !pari(numero);
	}

	static void riempiArray(int[] array){
		int i = 0;
		int numero = 2;
		while(i < array.length){
			if(primo(numero)){
				array[i] = numero;
				i++;
			}
			numero ++;
		}
	}

	static boolean primo(int numero){
		for(int i = 2; i < numero; i++){
			if(numero % i == 0)
				return false;
		}
		return true;
	}
}