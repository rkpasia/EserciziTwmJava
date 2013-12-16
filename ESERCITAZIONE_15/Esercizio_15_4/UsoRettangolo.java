class UsoRettangolo {
	public static void main(String[] args){
		//Rettangolo rett = new Rettangolo(30,15,"**");
		//System.out.println(Rettangolo.GetString(rett));

		Coordinate inf1 = new Coordinate(4,4);
		Coordinate sup1 = new Coordinate(0,0);
		Rettangolo r1 = new Rettangolo(inf1,sup1,"$");
		//Rettangolo uno = new Rettangolo(6,3,"%%");
		//Rettangolo due = new Rettangolo(6,3,"%%");
		//Rettangolo tre = new Rettangolo(14,2,"%%");
		//Rettangolo.CopyAt(rett,uno,2,2);
		//Rettangolo.CopyAt(rett,due,2,15);
		//Rettangolo.CopyAt(rett,tre,8,4);
		Coordinate inf2 = new Coordinate(8,8);
		Coordinate sup2 = new Coordinate(2,2);
		Rettangolo r2 = new Rettangolo(inf2,sup2,".");
		System.out.println(Rettangolo.GetString(r1));
		System.out.println(Rettangolo.GetString(r2));

		//Rettangolo unito = Rettangolo.unione(r1,r2);
		//System.out.println(Rettangolo.GetString(unito));
		//Rettangolo.CopyAt(r1,r2);
		//System.out.println(Rettangolo.GetString(r1));
		Rettangolo intersecato = Rettangolo.intersezione(r1,r2);
		System.out.println(Rettangolo.GetString(intersecato));		
		System.out.println(Rettangolo.GetLarghezza(r1)+" "+Rettangolo.GetAltezza(r1));
	}
}