class Esercizio6 {
	public static void main(String[] args) {
		System.out.print("Inserisci il lato del quadrato: ");
		int lato = Leggi.unInt();
		int area = areaQuadrato(lato,"Non ci posso credere");
		System.out.println("L'area del quadrato e': "+area);
	}
	static int areaQuadrato(int x, String messaggio){
		if(x>0){
			return x*x;
		}else{
			System.out.println(messaggio);
			return 0;
		}
	}
}