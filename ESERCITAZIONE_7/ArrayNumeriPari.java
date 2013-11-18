class ArrayNumeriPari {
	public static void main(String[] args){
		System.out.println("Inserisci un numero, verra' creato un array con n numeri pari corrispondenti al numero inserito:");
		int lunghezzaArray = Leggi.unInt();
		int[] arrayPari = new int[lunghezzaArray];
		int pari = 0;
		for(int i = 0; i < arrayPari.length; i++){
			arrayPari[i] = pari;
			pari = pari + 2;
		}
		for(int i = 0; i < arrayPari.length; i++){
			if( i != arrayPari.length-1){
				System.out.print(arrayPari[i]+",");
			}else{
				System.out.print(arrayPari[i]);
			}
		}
		System.out.println();
	}
}