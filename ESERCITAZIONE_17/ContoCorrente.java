class ContoCorrente{
	
	private double deposito;


	public ContoCorrente(){
		this(0);
	}

	public ContoCorrente(double euro){
		deposito = euro;
	}

	public void versamento(double euro){
		deposito = deposito + euro;
	}

	public double prelievo(double euro){
		deposito = deposito - euro;
		return euro;
	}

	public double saldo(){
		return deposito;
	}

	public boolean inRosso(){
		return deposito<0;
	}
}