class UsoFrazione {
	public static void main(String[] args){
		Frazione f1 = new Frazione(1,2);
		Frazione f2 = new Frazione(2,4);
		Frazione f3 = new Frazione(4,4);

		System.out.println("Frazione1 : "+Frazione.getString(f1));
		System.out.println("Frazione2 : "+Frazione.getString(f2));
		System.out.println("Frazione3 : "+Frazione.getString(f3));

		Frazione.moltiplica(f1,f2);
		System.out.println("Frazione1 per Frazione2 : "+Frazione.getString(f1));
		Frazione.divisione(f3,f1);
		System.out.println("Frazione3 diviso Frazione1 : "+Frazione.getString(f3));
		Frazione.sottrazione(f2,f3);
		System.out.println("Frazione2 meno Frazione3 : "+Frazione.getString(f2));
		Frazione.somma(f2,f1);
		System.out.println("Frazione2 piu' Frazione1 : "+Frazione.getString(f2));
	}
}