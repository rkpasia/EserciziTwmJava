class UsoFrazione {
	public static void main(String[] args){
		//Frazione fraz = new Frazione(2,4);
		//System.out.println(Frazione.getString(fraz));
		//Frazione.semplifica(fraz);
		//System.out.println("Frazione semplificata: "+Frazione.getString(fraz));
		Frazione f_1 = new Frazione(1,2);
		Frazione f_2 = new Frazione(2,4);
		Frazione f_3 = new Frazione(4,4);
		//System.out.println(Frazione.getString(f_1));
		//System.out.println(Frazione.getString(f_2));
		//System.out.println(Frazione.getString(f_3));
		//Frazione.semplifica(f_1);
		//Frazione.semplifica(f_2);
		//Frazione.semplifica(f_3);
		//System.out.println(Frazione.getString(f_1));
		//System.out.println(Frazione.getString(f_2));
		//System.out.println(Frazione.getString(f_3));
		Frazione.somma(f_1,f_2);
		System.out.println(Frazione.getString(f_1));
		Frazione.sottrazione(f_2,f_3);
		System.out.println(Frazione.getString(f_2));
		Frazione.moltiplica(f_1,f_2);
		System.out.println(Frazione.getString(f_1));
		Frazione.divisione(f_3,f_1);
		System.out.println(Frazione.getString(f_3));
	}
}