class StampaTriangolo {
	public static void main(String[] args){
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
}