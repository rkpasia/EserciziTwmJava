class UsoRettangolo {
	public static void main(String[] args){
		Rettangolo uno = new Rettangolo(7,7,"**");
		Rettangolo due = new Rettangolo(5,3,"%%");
		Rettangolo.copyAt(uno,due,2,1);
		System.out.println(Rettangolo.getString(uno));
	}
}