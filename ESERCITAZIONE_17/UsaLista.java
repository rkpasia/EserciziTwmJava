class UsaLista {
	public static void main(String[] args){
		System.out.print("Inserisci il numero di interi che vuoi aggiungere alla lista: ");
		int nElementiLista = Leggi.unInt();
		for(int i = 0; i < nElementiLista; i++){
			if(i == 0)
				l.inserisciPrimo(Leggi.unInt());
			else
				l.inserisciUltimo(Leggi.unInt());
		}
		/*int[] array1 = new int[nElementiLista];
		for(int i = 0; i < nElementiLista; i++){
			array1[i] = Leggi.unInt();
		}*/
		//System.out.print("Inserisci il numero di interi che vuoi aggiungere alla lista: ");
		//nElementiLista = Leggi.unInt();
		/*for(int i = 0; i < nElementiLista; i++){
			if(i == 0)
				l.inserisciPrimo(Leggi.unInt());
			else
				l.inserisciUltimo(Leggi.unInt());
		}*/
		/*int[] array2 = new int[nElementiLista];
		for(int i = 0; i < nElementiLista; i++){
			array2[i] = Leggi.unInt();
		}*/
		Lista l = new Lista(array1);
		//Lista b = new Lista(array2);
		//b.appendi(l);
		//System.out.println(l);
		//System.out.println(b+" "+b.lunghezza());
		l.cancella(5);
		System.out.println(l);
	}
}