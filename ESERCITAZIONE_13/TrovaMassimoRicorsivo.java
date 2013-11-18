class TrovaMassimoRicorsivo {
	public static void main(String[] args){
		int[] array = {1,5,3,4,5,45,1234,1,3,2,452,4,2,66,843,1};
		System.out.println(massimo(array));
	}

	static int massimo(int[] array){
		if(array.length == 1){
			return array[0];
		}else{
			return dividi(array);
		}
	}
	static int dividi(int[] array){
		//System.out.println("dividi");
		int[] arrayUno = new int[array.length/2];
		for(int i = 0; i < arrayUno.length; i++){
			arrayUno[i] = array[i];
			//System.out.print(arrayUno[i]);
		}
		//System.out.println();
		int[] arrayDue = new int[array.length-(array.length/2)];
		int appoggio = array.length/2;
		for(int i = 0; i < arrayDue.length; i++){
			arrayDue[i] = array[i+appoggio];
			//System.out.print(arrayDue[i]);
		}
		//System.out.println();
		if(massimo(arrayUno)>=massimo(arrayDue)) 
			return massimo(arrayUno);
		else
			return massimo(arrayDue);
	}
}