class MediaElementiArray3 {
	public static void main(String[] args){
		System.out.print("Leggi la lunghezza di un array:");
		int[] array = new int[Leggi.unInt()];
		riempiArray(array);
		System.out.println(mediaElementi(array));
	}
	static void riempiArray(int[] array){
		System.out.println("Leggi i numeri da inserire all'interno dell'array:");
		for(int i = 0; i < array.length; i++){
			array[i] = Leggi.unInt();
		}
	}
	static int sommaElementi(int[] array){
		int somma = 0;
		for(int i = 0; i < array.length; i++){
			somma = somma + array[i];
		}
		return somma;
	}
	static double mediaElementi(int[] array){
		return arrotonda((double)sommaElementi(array)/array.length,1);
	}

	static double arrotonda(double numero, int decimali){
		if(decimali == 0){
			if((int)(numero*10) % 10 >= 5){
				return (((int)(numero*10)/(10))+1);
			}else{
				return ((int)(numero*(10))/(10));
			}
		}else{
			return ((int)(numero*(Math.pow(10.0,decimali)))/(Math.pow(10.0,decimali)));
		}
	}

}