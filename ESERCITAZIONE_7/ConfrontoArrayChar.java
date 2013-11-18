class ConfrontoArrayChar {
	public static void main(String[] args){
		System.out.println("Leggi la lunghezza dei due array da confrontare:");
		int lunghezzaArray = Leggi.unInt();
		char[] array1 = new char[lunghezzaArray];
		char[] array2 = new char[lunghezzaArray];
		inserimentoDati(array1);
		inserimentoDati(array2);
		System.out.println((confronto(array1,array2))? "I due array sono uguali." : "I due array non sono uguali." );
	}
	static void inserimentoDati(char[] array){
		System.out.println("Inserisci i caratteri nell'array:");
		for(int i = 0; i < array.length; i++){
			array[i] = Leggi.unChar();
		}
	}
	static boolean confronto(char[] array1, char[] array2){
		boolean uguali = false;
		for(int i = 0; i < array1.length; i++){
			if(array1[i] == array2[i]){
				uguali = true;
			}else{
				uguali = false;
				break;
			}
		}
		return uguali;
	}
}