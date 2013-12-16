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
		if(s.litri+litri==s.capacita){
			s.riempi();
			svuota();
		}else if(s.quanto()+quanto()>s.capacita){
			litri = litri - s.capacita;
			s.riempi();
		}else{
			svuota();
			s.litri += litri;
		}
	}

	public int quanto(){
		return litri;
	}

}