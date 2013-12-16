public class UsaPilaInteriLimitata {
  public static void main(String[] args) {
    PilaInteriLimitata pila = new PilaInteriLimitata(5);
    try{
    	for (int i = 0; i<7; i++)
	      pila.metti(i);
    	for (int i = 0; i<7; i++)
    	  System.out.println(pila.estrai());
    }catch(EccezionePila e){
    	System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("Attenzione: "+e);
    }
  }
}