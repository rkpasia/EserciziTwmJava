class UsoContoCorrente{
	public static void main(String args[]){
		/*CREAZIONE ARRAY DI CONTI CORRENTE */
		System.out.print("Leggi il numero di conti correnti con cui si vuole operare:");
		int nConti = Leggi.unInt();
		ContoCorrente[] contiCorrente = new ContoCorrente[nConti];
		char operazione;
		double euroPrelevati;
		final int OPERAZIONI = 7; 			// IMPOSTARE IL NUMERO DI OPERAZIONI DA EFFETTUARE
		for(int i = 0; i < contiCorrente.length; i++){
			contiCorrente[i] = new ContoCorrente();
			for(int j = 1; j <= OPERAZIONI; j++){				
				System.out.println("	Conto corrente "+(i+1));
				System.out.print("	Operazione "+j+" : vuoi versare o prelevare? [V/P]");
				operazione = Leggi.unChar();
				if(operazione == 'V'){
					System.out.print("		Quanto vuoi versare? ");
					contiCorrente[i].versamento(Leggi.unDouble());
				}else if(operazione == 'P'){
					System.out.print("		Quanto vuoi prelevare? ");
					contiCorrente[i].prelievo(Leggi.unDouble());
				}else{
					System.out.println("		Errore, inserire V o P");
				}
			}
		}
		for(int i = 0; i < contiCorrente.length; i++){
			System.out.println("Conto corrente numero "+(i+1)+" ha un deposito di: "+contiCorrente[i].saldo());
		}
	}
}