class FigureTridimensionali {
	public static void main(String[] args){
		Figura3D[] figureTridimensionali = new Figura3D[10];
		for(int i = 0; i < figureTridimensionali.length; i++){
			float[] center = {i,i,i};
			if(i%2==0){
				figureTridimensionali[i] = new Sfera(i,center);
			}else{
				figureTridimensionali[i] = new Cubo(i,center);
			}
			figureTridimensionali[i].stampaVolume();
		}
	}
}