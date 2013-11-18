class RettangoloCoppiaInt {
	public static void main(String[] args){
		CoppiaInt coppia = new CoppiaInt(Leggi.unInt(),Leggi.unInt());
		stampaRettangolo(coppia);
	}

	static void stampaRettangolo(CoppiaInt coppia){
		for(int i = 0; i < CoppiaInt.GetPrimo(coppia); i++){
			for(int j = 0; j < CoppiaInt.GetSecondo(coppia); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}