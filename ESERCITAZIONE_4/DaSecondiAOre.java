class DaSecondiAOre {
	public static void main(String[] args){
		int ore,minuti,secondi;
		System.out.print("Inserisci un numero di secondi: ");
		secondi = Leggi.unInt();
		ore = ((secondi/60/60)-(secondi/60/60)%60);
		minuti = (secondi-(secondi%60))/60;
		int restoSecondi = (secondi%60);
		System.out.println(secondi+" secondi sono "+ore+" ore "+minuti+" minuti e "+restoSecondi+" secondi");
	}
}