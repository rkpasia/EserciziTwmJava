class DaOreASecondi {
	public static void main(String[] args){
		int ore,minuti,secondi;
		System.out.print("Leggi le ore: ");
		ore = Leggi.unInt();
		System.out.print("Leggi i minuti: ");
		minuti = Leggi.unInt();
		System.out.print("\nLeggi i secondi: ");
		secondi = Leggi.unInt();
		System.out.println("\nI minuti sono "+minuti+" e i secondi sono "+secondi+" che sono uguali a: "+((ore*60*60)+(minuti*60)+secondi)+" secondi.");
	}
}