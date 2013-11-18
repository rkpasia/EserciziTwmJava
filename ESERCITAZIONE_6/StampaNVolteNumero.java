class StampaNVolteNumero {
	public static void main(String[] args){
		int numeroUno,numeroDue;
		System.out.println("Leggi 2 numeri, il secondo numero verra' stampato n volte pari al primo numero inserito.");
		numeroUno = Leggi.unInt();
		numeroDue = Leggi.unInt();
		System.out.println();
		for(int i = 1; i <= numeroUno; i++){
			System.out.println(numeroDue);
		}
	}
}