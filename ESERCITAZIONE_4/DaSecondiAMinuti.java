class DaSecondiAMinuti {
	public static void main(String[] args){
		int secondi;
		System.out.print("Inserisci un numero di secondi: ");
		secondi = Leggi.unInt();
		System.out.println(secondi+" secondi sono "+((secondi-(secondi%60))/60)+" minuti e "+(secondi%60)+" secondi");
	}
}