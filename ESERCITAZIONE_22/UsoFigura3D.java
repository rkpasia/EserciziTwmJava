class UsoFigura3D {
	public static void main(String[] args){
		//Figura3D fig1 = new Figura3D(10f, new float[] {2, 4, 6});
		//Figura3D fig2 = new Figura3D();
		Figura3D fig3 = new Cubo(10f, new float[] {2, 4, 6});
		//Figura3D fig4 = new Cubo();
		Cubo fig5 = new Cubo(10f, new float[] {2, 4, 6});
		//Cubo fig6 = new Figura3D(10f, new float[] {2, 4, 6});
		Sfera fig7 = new Sfera(10f, new float[] {6, 8, 10});
		Figura3D fig8 = new Sfera(10f, new float[] {6, 8, 10});
	}
}

// NON POSSO CREARE ISTANZE DI UNA CLASSE ASTRATTA!!! Inoltre se eseguo new Cubo() non esiste un costruttore senza parametri.