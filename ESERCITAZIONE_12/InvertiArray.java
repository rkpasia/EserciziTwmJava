class InvertiArray {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		stampaArray(array);
		//riempiMatrice(matrice);
		//System.out.println("Leggi due numeri e scambia le righe della matrice.");
		invertiArray(array);
		stampaArray(array);
	}

	static void stampaArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}

	static void invertiArray(int[] array){
		int interoAppoggio;
		for(int i = 0; i < array.length/2; i++){
			interoAppoggio = array[array.length-1-i];
			array[array.length-1-i] = array[i];
			array[i] = interoAppoggio;
		}
	}
}