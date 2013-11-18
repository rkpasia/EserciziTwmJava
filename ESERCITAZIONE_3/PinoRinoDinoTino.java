class PinoRinoDinoTino {
  	public static void main(String[] args) {
	    int dado;
	    dado = Leggi.unInt();
	    System.out.print("Tocca a ");
	    System.out.println((dado ==0) ? "Pino" :
	                       ((dado == 1) ? "Rino" :
	                        ((dado == 2) ? "Dino" : "Tino")));
  	}
}