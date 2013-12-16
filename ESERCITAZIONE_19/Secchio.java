class Secchio{

	private int capacita;
	private int litri;

	public Secchio(int capacita){
		this.capacita = capacita;
	}

	public void riempi(){
		litri = capacita;
	}
	public void svuota(){
		litri = 0;
	}

	public void travasaIn(Secchio s){
		if(s.litri != s.capacita){
			if(s.litri+litri==s.capacita){
				s.riempi();
				svuota();
			}else if(s.litri+litri>s.capacita){
				litri = litri - (s.capacita - s.litri);
				s.riempi();
			}else{
				s.litri += litri;
				svuota();
			}
		}
	}

	public int quanto(){
		return litri;
	}

}