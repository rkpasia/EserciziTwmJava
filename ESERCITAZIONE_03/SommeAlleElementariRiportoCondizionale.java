class SommeAlleElementariRiportoCondizionale {
  	public static void main(String[] args) {
	    int cifra1;
	    int cifra2;
	    cifra1 = 2;
	    cifra2 = 3;
	    int riporto = (cifra1+cifra2-((cifra1+cifra2)%10))/10;
	    System.out.println("Scrivo "+(cifra2+cifra1)%10 + ((riporto !=0 ) ? " e riporto " + riporto:""));
  	}
}