class Palindromi {
	public static void main(String[] args){
		System.out.println("Leggi due numeri minori di 10:");
		int n = Leggi.unInt();
		int m = Leggi.unInt();
		int lunghezzaPalindromo = ((massimo(n,m)-minimo(n,m))*2)+1;
		stampaPalindromo(minimo(n,m),lunghezzaPalindromo);
		System.out.println();
	}
	static int minimo(int n, int m){
		return (n<=m) ? n : m;
	}

	static int massimo(int n, int m){
		return(n>=m) ? n : m;
	}

	static void stampaPalindromo(int n, int lunghezzaPalindromo){
		for(int i = 1; i<=lunghezzaPalindromo; i++){
			if(i<(lunghezzaPalindromo/2)+1){
				System.out.print(n);
				n++;
			}else{
				System.out.print(n);
				n--;
			}
		}
	}
}