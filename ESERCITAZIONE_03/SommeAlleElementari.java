class SommeAlleElementari {
  	public static void main(String[] args) {
	    int cifra1;
	    int cifra2;
	    cifra1 = 12;
	    cifra2 = 10;
	    System.out.println("Scrivo "+(cifra2+cifra1)%10+" e riporto "+((cifra1+cifra2-((cifra1+cifra2)%10))/10));
  	}
}