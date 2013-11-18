class Coordinate {

	private int x;
	private int y;

	public Coordinate(int xCoord, int yCoord){
		x = xCoord;
		y = yCoord;
	}    

	public static int GetX(Coordinate coord){
		return coord.x;
	}
 
	public static int GetY(Coordinate coord){
		return coord.y;
	}    
}

class Rettangolo {
  
	private Coordinate inf;
	private Coordinate sup;
	private String[][] matrice;
    
	public Rettangolo(Coordinate inf, Coordinate sup, String car){
		this.inf = inf;
		this.sup = sup;
		matrice = new String[Coordinate.GetY(inf)-Coordinate.GetY(sup)][Coordinate.GetX(inf)-Coordinate.GetY(sup)];
		for(int i=0; i < matrice.length; i++) {
			for(int z=0; z < matrice[i].length; z++) {
				matrice[i][z] = car;
			}
		}
	}

	public Rettangolo(int larg, int alt, String car){
		// Le coordinate di sup vanno fissate a (0,0)
		this(new Coordinate(larg,alt),new Coordinate(0,0),car);
	}

	public Rettangolo(int lato, String car){
		this(lato,lato,car);
	}

	public static int GetLarghezza(Rettangolo rett){
		return Coordinate.GetX(rett.inf)-Coordinate.GetX(rett.sup);
	}

	public static int GetAltezza(Rettangolo rett){
		return Coordinate.GetY(rett.inf)-Coordinate.GetY(rett.sup);
	}    

	public static String GetString(Rettangolo rett){
		String s = "";
		for(int i=0; i < Rettangolo.GetAltezza(rett); i++) {
			for(int z=0; z < Rettangolo.GetLarghezza(rett); z++) {
				s = s + rett.matrice[i][z];
			}
			s += "\n";
		}
		return s;	}

	public static void CopyAt(Rettangolo r1 ,Rettangolo r2, int x, int y){
		if(r1.matrice.length<x+r2.matrice.length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else if(r1.matrice[0].length<y+r2.matrice[0].length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else{
			for(int i = x; i < r2.matrice.length+x; i++){
				for(int j = y; j < r2.matrice[0].length+y; j++){
					r1.matrice[i][j] = " ";
				}
			}
		}
	}

	public static void CopyAt(Rettangolo r1 ,Rettangolo r2){
		if(r1.matrice.length<Coordinate.GetX(r2.sup)+r2.matrice.length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else if(r1.matrice[0].length<Coordinate.GetY(r2.sup)+r2.matrice[0].length){
			System.out.println("Errore il secondo rettangolo non sta nel secondo");
		}else{
			for(int i = Coordinate.GetY(r2.sup); i < r2.matrice.length+Coordinate.GetY(r2.sup); i++){
				for(int j = Coordinate.GetX(r2.sup); j < r2.matrice[0].length+Coordinate.GetX(r2.sup); j++){
					r1.matrice[i][j] = " ";
				}
			}
		}
	}


	public static Rettangolo intersezione(Rettangolo r1, Rettangolo r2){
		return new Rettangolo(
			new Coordinate((Coordinate.GetX(r1.inf)<Coordinate.GetX(r2.inf))?Coordinate.GetX(r1.inf):Coordinate.GetX(r2.inf),(Coordinate.GetY(r1.inf)<Coordinate.GetY(r2.inf))?Coordinate.GetY(r1.inf):Coordinate.GetY(r2.inf)),
			new Coordinate((Coordinate.GetX(r1.sup)<Coordinate.GetX(r2.sup))?Coordinate.GetX(r2.sup):Coordinate.GetX(r1.sup),(Coordinate.GetY(r1.sup)>Coordinate.GetY(r2.sup))?Coordinate.GetY(r1.sup):Coordinate.GetY(r2.sup)),
			 "$");
	}

	public static Rettangolo unione(Rettangolo r1, Rettangolo r2){
		Rettangolo rettUnito = new Rettangolo(
									new Coordinate( (Coordinate.GetX(r1.inf)<Coordinate.GetX(r2.inf))?Coordinate.GetX(r2.inf):Coordinate.GetX(r1.inf) , (Coordinate.GetY(r1.inf)<Coordinate.GetY(r2.inf))?Coordinate.GetY(r2.inf):Coordinate.GetY(r1.inf) ),
		 							new Coordinate( (Coordinate.GetX(r1.sup)<Coordinate.GetX(r2.sup))?Coordinate.GetX(r1.sup):Coordinate.GetX(r2.sup) , (Coordinate.GetY(r1.sup)>Coordinate.GetY(r2.sup))?Coordinate.GetY(r2.sup):Coordinate.GetY(r1.sup) ),
		 							" ");
		rettUnito.matrice = new String[Rettangolo.GetAltezza(rettUnito)][Rettangolo.GetLarghezza(rettUnito)];

		for(int i = 0; i < rettUnito.matrice.length; i++){
			for(int j = 0; j < rettUnito.matrice[i].length; j++){
				if(( i>=Coordinate.GetY(r1.sup) && i <= Coordinate.GetY(r1.inf) && j >= Coordinate.GetX(r1.sup) && j <= Coordinate.GetX(r1.inf) )||( i>=Coordinate.GetY(r2.sup) && i <= Coordinate.GetY(r2.inf) && j >= Coordinate.GetX(r2.sup) && j <= Coordinate.GetX(r2.inf) )){
					rettUnito.matrice[i][j] = "%";
				}else{
					rettUnito.matrice[i][j] = " ";
				}
			}
		}

		return rettUnito;
	}
}