class ArrotondaAllaSecondaCifraDecimale {
	public static void main(String[] args){	
		System.out.println((arrotonda(Leggi.unDouble())));
	}

	static double arrotonda(double numero){
		int unita = (int)(numero*1000) % 10;
		if(unita >= 5){
			numero = (int)(numero*100)+1;
			return numero/100;
		}else{
			numero = (int)(numero*100);
			return numero/100;
		}
	}
}