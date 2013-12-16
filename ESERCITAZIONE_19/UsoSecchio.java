class UsoSecchio {
	public static void main(String[] args){
		Secchio s1 = new Secchio(5);
		Secchio s2 = new Secchio(3);
		
		s2.riempi();
		s2.travasaIn(s1);
		s2.riempi();
		s2.travasaIn(s1);
		s1.svuota();
		s2.travasaIn(s1);
		s2.riempi();
		s2.travasaIn(s1);		
		System.out.println("s1 contiene "+s1.quanto()+" litri");
	}
}