class Fattoriale {
	public static void main(String[] args){
		System.out.println("Inserisci un numero, verra' calcolato il suo fattoriale.");
		long numero = Leggi.unLong();
		System.out.println(fattoriale(numero));
	}
	static long fattoriale(long numero){
		if(numero != 0){
			return numero * fattoriale(numero-1);
		}else{
			return 1;
		}
	}
}