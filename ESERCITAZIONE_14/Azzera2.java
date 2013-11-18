public class Azzera2 {

	public static void main(String[] args){
		int[] a = {0, 1, 2, 3, 4};
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		for (int i = 0; i < a.length; i++)
			azzera(a[i]);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}  

	static void azzera(int x){
		x = 0;
	}
}

/* ancora una volta il metodo non è una funzione ma una procedura e non viene modificato il valore del parametro attuale permanentemente
ma solo localmente al metodo. */