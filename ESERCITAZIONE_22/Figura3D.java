abstract class Figura3D{
	private float[] centro;
	protected void setCentro(float[] centro){this.centro = centro;}
	public abstract double calcolaVolume();
	protected abstract String tipoFigura();
	public void stampaVolume(){
	  System.out.println("Volume "+ tipoFigura() + calcolaVolume());
	}
}
