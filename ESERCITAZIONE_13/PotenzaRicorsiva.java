class PotenzaRicorsiva {
	public static void main(String[] args){
		System.out.println(potenza(Leggi.unInt(),Leggi.unInt()));
	}

	public static double potenza(double numero, int esponente){
		if(esponente == 0){
			return 0;
		}else if(esponente == 1){
			return numero;
		}else if(esponente%2==0){
			return potenza(numero,esponente/2)*potenza(numero,esponente/2);
		}else{
			return numero*potenza(potenza(numero,(esponente-1)/2),2);
		}
	}
}