class Rettangolo {
	
	public  int larghezza;
	public  int altezza;
	public  String[][] matrice;

	/** Creates a new instance of Rettangolo */
	public Rettangolo(int larg, int alt, String car) {
		larghezza = larg;
		altezza = alt;
		matrice = new String[altezza][larghezza];
		for(int i=0; i < altezza; i++) {
			for(int z=0; z < larghezza; z++) {
				matrice[i][z] = car;
			}
		}
	}
        
	/** Creates a new instance of Rettangolo */
	public Rettangolo(int lato, String car) {
		this(lato,lato,car);
	}

	public static String GetString(Rettangolo rett){
		String s = "";
		for(int i=0; i < rett.altezza; i++) {
			for(int z=0; z < rett.larghezza; z++) {
				s = s + rett.matrice[i][z];
			}
			s += "\n";
		}
		return s;
	}  

	public static void copyAt(Rettangolo r1, Rettangolo r2, int x, int y){
		if(r1.matrice.length<x+r2.matrice.length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else if(r1.matrice[0].length<y+r2.matrice[0].length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else{
			for(int i = x; i < r2.matrice.length+x; i++){
				for(int j = y; j < r2.matrice[0].length+y; j++){
					r1.matrice[i][j] = "  ";
				}
			}
		}
	}
}