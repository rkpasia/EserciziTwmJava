class NAsterischiECapoPersonali {
	public static void main(String[] args){
		System.out.println("Leggi il numero di asterischi che vuoi stampare:");
		int nAsterischi = Leggi.unInt();
		System.out.println("Leggi ogni quanto vuoi andare a capo:");
		int nCapo = Leggi.unInt();
		for(int i = 1; i <= nAsterischi; i++){
			System.out.print("*");
			if(i%nCapo==0){
				System.out.println();
			}	
		}
	}
}