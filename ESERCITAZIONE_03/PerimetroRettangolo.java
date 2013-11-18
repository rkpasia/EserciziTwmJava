/* Programma per il calgolo del perimetro di un rettangolo */
class PerimetroRettangolo{
	public static void main(String[] args){
		System.out.println("Inserisci l'altezza e la base del rettangolo: ");
		int h=Leggi.unInt(), b=Leggi.unInt();
		System.out.println(2*(b+h)); /* IL DOPPIO DELLA BASE PIU' L'ALTEZZA DEL RETANGOLO */
	}
}