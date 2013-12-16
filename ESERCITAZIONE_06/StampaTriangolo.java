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
		System.out.println();
		triangoloContrario(lato,corpo);
		System.out.println();
		triangoloContrarioDestra(lato,corpo);
		System.out.println();
		triangoloDestra(lato,corpo);
	}

	static void triangoloContrario(int lato, char corpo){
		for(int i = lato; i >= 1; i--){
			for(int j = i; j >= 1; j--){
				System.out.print(corpo);
			}
			System.out.println();
		}
	}
	static void triangoloContrarioDestra(int lato, char corpo){
		for(int i = lato; i >= 1; i--){
			for(int j = lato; j >= 1; j--){
				System.out.print((i>=j) ? corpo : " ");
			}
			System.out.println();
		}
	}
	static void triangoloDestra(int lato, char corpo){
		for(int i = 1; i <= lato; i++){
			for(int j = 1; j <= lato; j++){
				System.out.print((j>lato-i) ? corpo : " ");
			}
			System.out.println();
		}
	}
}