class StampaFreccia {
	public static void main(String[] args){
		System.out.println("Leggi la lunghezza della freccia:");
		int lunghezza = Leggi.unInt();
		System.out.println("Leggi il verso della freccia: d per destra, s per sinistra");
		char verso = Leggi.unChar();
		String freccia = "";
		for(int i = 1; i <= lunghezza; i++){
			freccia = freccia + "-";
		}
		System.out.println((verso == 'd')? freccia+">":"<"+freccia);
	}
}