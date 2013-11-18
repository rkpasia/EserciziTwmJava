/* Programma che calcola l'area di un trapezio */
class AreaTrapezio {
	public static void main(String[] args){
		System.out.println("Inserisci il valore della base minore, maggiore e altezza: ");
		double b1=Leggi.unDouble(), b2=Leggi.unDouble(), h=Leggi.unDouble();
		System.out.println("L'area del trapezio è: "+(b1+b2)*h/2);
	}
}