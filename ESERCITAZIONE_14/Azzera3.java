public class Azzera3 {

	public static void main(String[] args){
		int[] a = {0, 1, 2, 3, 4};
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		azzera(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}  

	static void azzera(int[] x){
		for (int i = 0; i < x.length; i++)
			x[i] = 0;
	}
}


/* Questa volta l'output viene modificato perche' gli array sono allocati in una zona della memoria dove si puo' accedere
soltanto tramite un puntatore ad essa, quando si invia ad un metodo un parametro attuale che e' un puntatore ad un array, e' come 
se si andasse a modificare lo stesso array che si e' passato dato valore al metodo */

// OUTPUT 0 0 0 0