public class Moto extends Veicolo {

    private int numPosti;

    public Moto(int matricola, String proprietario, int posti){
    	super.numMatricola = matricola;
    	super.proprietario = proprietario;
		numPosti = posti;
    }

    public String toString(){
    	return "Numero di matricola: " + numMatricola + ", Proprietario: " + proprietario+", Numero posti: "+numPosti;
    }

} 