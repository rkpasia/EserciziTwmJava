class SottoSequenze {
	public static void main(String[] args){
		char[] arrayUno = {'a','b','c'};
		char[] arrayDue = {'1','2','a','1','a','b','c'};
		if(sottoSequenza(arrayUno,arrayDue)){
			System.out.println("Il primo e' sotto sequenza del secondo");
		}else{
			System.out.println("Non e' sottosequenza");
		}
	}

	static boolean sottoSequenza(char[] arrayUno, char[] arrayDue){
		int indiceArrayUno = 0;
		for(int i = 0; i < arrayDue.length; i++){
			if(arrayDue[i]==arrayUno[indiceArrayUno]){
				indiceArrayUno++;
				if(indiceArrayUno == arrayUno.length){
					return true;
				}
			}else{
				indiceArrayUno = 0;
			}
		}
		return false;
	}
}