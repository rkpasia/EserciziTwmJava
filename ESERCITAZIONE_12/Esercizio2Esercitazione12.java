class ScambioRigheMatrice {
	public static void main(String[] args){
		//int[][] matrice = new int[Leggi.unInt()][Leggi.unInt()];
		int[][] matrice = {{1,2,3,4,5},{5,6,7,8,3},{9,8,7,6,5}};
		stampaMatrice(matrice);
		//riempiMatrice(matrice);
		System.out.println("Leggi due numeri e scambia le righe della matrice.");
		scambiaRighe(matrice,Leggi.unInt(),Leggi.unInt());
		stampaMatrice(matrice);
	}

	static void riempiMatrice(int[][] matrice){
		System.out.println("Riempi la matrice");
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				matrice[i][j] = Leggi.unInt();
			}
		}
	}

	static void scambiaRighe(int[][] matrice, int rigaUno, int rigaDue){
		//int[] arrayAppoggio = new int[matrice[0].length];
		int interoDiAppoggio;
		for(int i = 0; i < matrice[0].length; i++){
			//arrayAppoggio[i] = matrice[rigaUno][i];
			interoDiAppoggio = matrice[rigaUno][i];
			matrice[rigaUno][i] = matrice[rigaDue][i];
			matrice[rigaDue][i] = interoDiAppoggio;
		}
	}

	static void stampaMatrice(int[][] matrice){
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				System.out.print(matrice[i][j]);
			}
			System.out.println();
		}
	}
}