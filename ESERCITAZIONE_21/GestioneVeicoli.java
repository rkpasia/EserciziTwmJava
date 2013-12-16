class GestioneVeicoli {

	public static void main(String[] args) {
	  Veicolo[] veicoli = new Veicolo[2];
	  veicoli[0] = new Auto(100,"Riccardo Pasianotto","Ferrari Rossa");
	  veicoli[1] = new Moto(101,"Riccardo Pasianotto",2);
	  for (int i = 0; i < veicoli.length; i++){
	  	System.out.println(veicoli[i]);
	  }
	  System.out.println(veicoli[0].getMatricola());
  	  System.out.println(((Auto)veicoli[0]).getModello());
	}

}