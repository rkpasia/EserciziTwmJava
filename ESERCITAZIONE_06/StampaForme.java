class StampaForme {
	public static void main(String[] args){
		boolean exit = false;
		do{
			System.out.println("Inserisci:\n1)Stampa scatola\n2)Stampa triangolo\n3)Stampa freccia\n4)Per uscire");
			int scelta = Leggi.unInt();
			switch (scelta) {
				case 1 : stampaScatola();
				break;
				case 2 : stampaTriangolo();
				break;
				case 3 : stampaFreccia();
				break;
				case 4 : exit = true;
				break;
			}
		}while(!exit);
	}
	static void stampaScatola(){
		System.out.println("Leggi 2 numeri, il primo riguardera' l'altezza della scatola, il secondo la sua larghezza:");
		int altezza = Leggi.unInt();
		int larghezza = Leggi.unInt();
		System.out.println("Ora leggi un carattere che verra' stampato per rappresentare graficamente la scatola:");
		char corpo = Leggi.unChar();
		System.out.println();
		for(int i = 1; i <= altezza*larghezza; i++){
			System.out.print(corpo);
			if(i%larghezza == 0){
				System.out.println();
			}
		}
	}
	static void stampaTriangolo(){
		System.out.println("Leggi il lato del triangolo:");
		int lato = Leggi.unInt();
		System.out.println("Leggi un carattere che visualizzera' il triangolo:");
		char corpo = Leggi.unChar();
		System.out.println();
		for(int i = 1; i <=lato; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(corpo);
			}
			System.out.println();
		}
	}
	static void stampaFreccia(){
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