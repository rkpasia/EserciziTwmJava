class NAsterischiPersonali {
	public static void main(String[] args){
		System.out.println("Leggi un numero, a seconda di cosa inserirai verranno stampati n asterischi.");
		int nAsterischi = Leggi.unInt();
		for(int i = 1; i <= nAsterischi; i++){
			System.out.print("*");
			if(i%3==0){
				System.out.println();
			}	
		}
	}
}