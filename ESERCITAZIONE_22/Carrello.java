class Carrello {
	
	private Prodotto[] listaProdotti;
	private int indiceCarrello = 0;
	private final static int DIMENSIONE_CARRELLO_STANDARD = 25;		//LA COSTANTE DEVE ESSERE UNA VARIABILE STATICA PERCHE' ALTRIMENTI E' UNA VARIABILE D'ISTANZA E NON DI CLASSE, QUINDI SE L'OGGETTO NON E' ANCORA STATO ISTANZIATO NON POSSO CHIAMARE IL COSTRUTTORE TRAMITE LA COSTANTE

	public Carrello(int grandezzaCarrello){
		listaProdotti = new Prodotto[grandezzaCarrello];
	}
	public Carrello(){
		this(DIMENSIONE_CARRELLO_STANDARD);			//SE NON SPECIFICO UNA GRANDEZZA A PIACERE IMPOSTO UNA GRANDEZZA PREDEFINITA A 25.
	}
	public Prodotto[] prodotti(){
		return listaProdotti;
	}

	public void insProdotto(Prodotto p){	
		if(indiceCarrello == listaProdotti.length-1){
			System.out.println("IL CARRELLO E' PIENO LEVA UN PRODOTTO");
		}else{
			listaProdotti[indiceCarrello] = p;
			indiceCarrello++;
		}		
	}
	public void rimProdotto(){
		listaProdotti[indiceCarrello] = null;
		indiceCarrello--;
	}
	public void rimProdotto(int index){
		listaProdotti[index] = null;
		compatta(listaProdotti,index);
	}	
	private void compatta(Prodotto[] lista, int index){
		for(int i = index+1; i < lista.length; i++ ){
			lista[i-1] = lista[i];
		}
		indiceCarrello--;
	}
	public String toString(){
		String s = "";
		if(indiceCarrello == 0){
			return "Non ci sono prodotti nel carrello";
		}else{
			for(int i = 0; i < indiceCarrello; i++){
				s += "Prezzo prodotto: " + listaProdotti[i].getPrezzo();
			}
			return s;
		}
	}

}