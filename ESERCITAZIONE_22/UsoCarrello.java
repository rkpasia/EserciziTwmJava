class UsoCarrello {
	public static void main(String[] args){
		Carrello c = new Carrello();
		Cassa cassa = new Cassa();
		/*Libro l1 = new Libro(12.30);
		Libro l2 = new Libro(1.50);
		Cd cd = new Cd(8.0);
		c.insProdotto(l1); 
		c.insProdotto(l2);
		c.insProdotto(cd); 
		Cassa cassa = new Cassa();
		System.out.println(cassa.conto(c));*/
		System.out.print("Leggi il numero di libri che vuoi acquistare ");
		int numeroLibri = Leggi.unInt();
		for(int i = 0; i < numeroLibri; i++){
			System.out.print("Leggi il prezzo del Libro"+i+" ");
			c.insProdotto(new Libro(Leggi.unDouble()));
		}
		System.out.print("Inserisci il prezzo del Cd1 ");
		c.insProdotto(new Cd(Leggi.unDouble()));
		System.out.print("Inserisci il prezzo del Cd2 ");
		c.insProdotto(new Cd(Leggi.unDouble()));
		System.out.println("Il totale a pagare e': " + cassa.conto(c));
	}
}