class FunzioneDiAkermann {
	public static void main(String[] args){
		System.out.println(akermann(3,12));
	}

	static int akermann(int primoTermine, int secondoTermine){
		if(primoTermine == 0){
			return ++secondoTermine;
		}else if(secondoTermine == 0){
			return akermann(primoTermine-1,1);
		}else{
			return akermann(primoTermine-1,akermann(primoTermine,secondoTermine-1));
		}
	}
}