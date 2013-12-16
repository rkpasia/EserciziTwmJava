class UsoSecchio {
	public static void main(String[] args){
		/*Secchio s1 = new Secchio(10);
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		s1.riempi();
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		Secchio s2 = new Secchio(4);
		System.out.println("S2 contiene "+s2.quanto()+" litri");
		s1.travasaIn(s2);
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		System.out.println("S2 contiene "+s2.quanto()+" litri");
		s1.travasaIn(s2);
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		System.out.println("S2 contiene "+s2.quanto()+" litri");
		s2.svuota();
		s1.travasaIn(s2);
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		System.out.println("S2 contiene "+s2.quanto()+" litri");
		s2.svuota();
		s1.travasaIn(s2);
		System.out.println("S1 contiene "+s1.quanto()+" litri");
		System.out.println("S2 contiene "+s2.quanto()+" litri");*/

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