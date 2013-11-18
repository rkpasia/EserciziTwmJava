class PalindromiMaggiori10 {
	public static void main(String[] args){
		System.out.println("Leggi due numeri minori di 100:");
		int n = Leggi.unInt();
		int m = Leggi.unInt();
		int lunghezzaPalindromo = ((massimo(n,m)-minimo(n,m))*2)+1;
		int[][] matrice = new int[lunghezzaPalindromo][2];
		creaPalindromo(matrice,minimo(n,m),lunghezzaPalindromo);
		stampaPalindromo(matrice);
	}
	static int numeroCifre(int numero){
		int i = 0; 
		while(numero == 0){
			numero = numero / 10;
			i++;
		}
		return i; 
	}
	static int minimo(int n, int m){
		return (n<=m) ? n : m;
	}
	static int massimo(int n, int m){
		return(n>=m) ? n : m;
	}
	static void creaPalindromo(int[][] matrice, int n, int lunghezzaPalindromo){
		for(int i = 0; i<lunghezzaPalindromo; i++){
			if(i<(lunghezzaPalindromo/2)){
				matrice[i][0] = (((n-(n%10))/10)==0) ? ' ' : (n-(n%10))/10;
				matrice[i][1] = n % 10;
				n++;
			}else{
				matrice[i][0] = (((n-(n%10))/10)==0) ? ' ' : (n-(n%10))/10;
				matrice[i][1] = n % 10;
				n--;
			}
		}
	}
	static void stampaPalindromo(int[][] matrice){
		for(int i = 0; i < matrice[i].length; i++){
			for(int j = 0; j < matrice.length; j++){
				System.out.print((matrice[j][i]== ' ' ) ? " " : matrice[j][i]);
			}
			System.out.println();
		}
	}
}