class StampaScatola {
	public static void main(String[] args){
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
}