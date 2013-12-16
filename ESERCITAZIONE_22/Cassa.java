class Cassa {
	
	public Cassa(){}

	public double conto(Carrello c){
		Prodotto[] listaProdotti = c.prodotti();
		int i = 0;
		double prezzoTotale = 0;
		while(listaProdotti[i] != null){
			prezzoTotale += listaProdotti[i].getPrezzo();
			i++;
		}
		return prezzoTotale;
	}


}