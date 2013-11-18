class StampaERiempiMatriceSpecialeDiagonale {
	public static void main(String[] args){
		System.out.print("Inserisci la dimensione della matrice:");
		int dimensioneMatrice = Leggi.unInt();
		char[][] matrice = new char[dimensioneMatrice][dimensioneMatrice];
		System.out.print("Con quale carattere devo riempirla?");
		char corpo = Leggi.unChar();
		System.out.print("Quale carattere per la diagonale?");
		char corpoDiagonale = Leggi.unChar();
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				if(i==j){
					matrice[i][j] = corpoDiagonale;
				}else{
					matrice[i][j] = corpo;
				}
			}
		}
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
	}
}