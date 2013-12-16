class Bersaglio {
	public static void main(String[] args){
		int lunghezzaMatrice = Leggi.unInt();
		char[][] matrice = new char[lunghezzaMatrice][lunghezzaMatrice];
		char corpo = Leggi.unChar();		
		char corpoCombo = Leggi.unChar();
		long startTime,endTime;
		startTime = System.currentTimeMillis();
		for(int i = 0; i < matrice.length; i++){
			for(int j = i; j <matrice[i].length-i; j++){
				matrice[i][j] = (i%2==0) ? corpo : corpoCombo;
				matrice[j][i] = (i%2==0) ? corpo : corpoCombo;
				matrice[matrice.length-1-i][j] = (i%2==0) ? corpo : corpoCombo;
				matrice[j][matrice.length-1-i] = (i%2==0) ? corpo : corpoCombo;
			}
		}
		endTime = System.currentTimeMillis();
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(endTime-startTime);q
	}
}