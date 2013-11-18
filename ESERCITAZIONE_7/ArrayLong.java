class ArrayLong {
	public static void main(String[] args){
		System.out.println("Inserisci la lunghezza dell'array:");
		int lunghezzaArray = Leggi.unInt();
		long[] array = new long[lunghezzaArray];
		System.out.println("Leggi i "+ lunghezzaArray +" elementi da inserire nell'array:");
		for(int i = 0; i < array.length; i++){
			array[i] = Leggi.unLong();
		}
		System.out.println("Leggi l'indice dell'elemento che vuoi stampare all'interno dell'array:");
		int indice = Leggi.unInt();
		System.out.println("L'elemento in posizione "+indice+" e' " +elementoAt(array,indice));
	}
	static long elementoAt(long[] array, int indice){
		return array[indice-1];
	}
}