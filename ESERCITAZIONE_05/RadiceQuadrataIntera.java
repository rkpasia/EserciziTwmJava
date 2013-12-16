class RadiceQuadrataIntera {
	public static void main(String[] args){
		System.out.println(radiceIntera(Leggi.unInt()));
	}
	static int radiceIntera(int numero){
		int radice = 0;
		for(int i = (numero-1); i >= 0; i--){
			if(!(i*i>numero)){
				radice = i;
				break;
			}
		}
		return radice;
	}
}