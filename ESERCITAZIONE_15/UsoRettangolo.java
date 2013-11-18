class UsoRettangolo {
	public static void main(String[] args){
		Rettangolo rett = new Rettangolo(30,15,"**");
		System.out.println(Rettangolo.GetString(rett));
		Rettangolo uno = new Rettangolo(6,3,"%%");
		Rettangolo due = new Rettangolo(6,3,"%%");
		Rettangolo tre = new Rettangolo(14,2,"%%");
		Rettangolo.copyAt(rett,uno,2,2);
		Rettangolo.copyAt(rett,due,2,15);
		Rettangolo.copyAt(rett,tre,8,4);
		System.out.print(Rettangolo.GetString(rett));
	}
}