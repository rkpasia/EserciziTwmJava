class DaMinutiASecondi {
	public static void main(String[] args){
		System.out.print("Leggi i minuti: ");
		int minuti = Leggi.unInt();
		System.out.print("\nLeggi i secondi: ");
		int secondi = Leggi.unInt();
		System.out.println("\nI minuti sono "+minuti+" e i secondi sono "+secondi+" che sono uguali a: "+((minuti*60)+secondi)+" secondi.");
		daSecondiAMinuti(215);
		daSecondiAOre(21500);
		daOreASecondi(5,58,20);
	}

	static void daSecondiAMinuti(int secondi){
		System.out.println(secondi+" secondi sono "+((secondi-(secondi%60))/60)+" minuti e "+(secondi%60)+" secondi");
	}

	static void daSecondiAOre(int secondi){
		int ore,minuti;
		minuti = (secondi/60)%60;
		ore = ((secondi/60)/60)%60;
		int restoSecondi = (secondi%60);
		System.out.println(secondi+" secondi sono "+ore+" ore "+minuti+" minuti e "+restoSecondi+" secondi");
	}

	static void daOreASecondi(int ore, int minuti, int secondi){
		System.out.println("\nLe ore sono "+ore+" i minuti sono "+minuti+" e i secondi sono "+secondi+" che sono uguali a: "+((ore*60*60)+(minuti*60)+secondi)+" secondi.");
	}
}