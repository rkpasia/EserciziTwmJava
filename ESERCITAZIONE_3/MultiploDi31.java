class MultiploDi31 {
	public static void main(String[] args){
		double multiplo;
		multiplo = Leggi.unDouble();
		//(31 % multiplo == 0) ? (System.out.println(multiplo + " è multiplo di 31")) : (System.out.println(multiplo + " non è multiplo di 31"));
		System.out.println((multiplo % 31 == 0) ? "E' multiplo di 31" : "Non è multiplo di 31" );
	}
}