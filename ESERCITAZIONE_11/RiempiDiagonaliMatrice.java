class RiempiDiagonaliMatrice {
	public static void main(String[] args){
		System.out.println("Inserisci 2 numeri, il primo minore dell'altro.");
		int[][] matrice = new int[Leggi.unInt()][Leggi.unInt()];
		diagonali(matrice);
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void diagonali(int[][] matrice){
		for(int i = 0; i < matrice.length; i++){
			matrice[i][i] = i;
			matrice[i][i+(matrice[i].length-1-(matrice.length-1))] = i;
		}
	}
}