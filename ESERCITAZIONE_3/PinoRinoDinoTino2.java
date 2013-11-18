class PinoRinoDinoTino2 {
  	public static void main(String[] args) {
	    int dado;
	    dado = Leggi.unInt();
	    System.out.print("Tocca a ");
	    System.out.println((dado ==0) ? "Pino" :
	                       ((dado == 1) ? "Rino" :
	                        ((dado == 2) ? "Dino" : "Tino")));
	    dado = (dado == 3) ? dado = 0 : dado+1;
	    System.out.print("Poi tocca a ");
	    System.out.println((dado ==0) ? "Pino" :
	                       ((dado == 1) ? "Rino" :
	                        ((dado == 2) ? "Dino" : "Tino")));
  	}
}