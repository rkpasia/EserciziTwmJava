/* Programma che calcola la circonferenza del cerchio di raggio x*/
class Circonferenza {
	public static void main(String[] args){
		System.out.print("Inserisci il raggio: ");
		double raggio = Leggi.unDouble();
		System.out.println("La circonferenza è: "+ 2*raggio*3.14);
	}
}