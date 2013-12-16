class UsoScacchiera {
	public static void main(String[] args){
		Scacchiera s = new Scacchiera(' ');
		System.out.println(s);
		System.out.println((s.mettiIn(2,2,'x'))? s : "NON RIUSCITO");
	}
}