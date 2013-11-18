class Esercizio5 {
	public static void main(String[] args) {
		System.out.print("Inserisci il lato del quadrato: ");
		int lato = Leggi.unInt();
		int area = areaQuadrato(lato);
		System.out.println("L'area del quadrato e': "+area);
	}
	static int areaQuadrato(int x){
		if(x>0){
			return x*x;
		}else{
			System.out.println("Errore il lato inserito e' minore o uguale a 0!");
			return 0;
		}
	}
}