class CreazioneEStampaInvertitoArray {
	public static void main(String[] args){
		double[] array = new double[10];
		System.out.println("Leggi 10 double, essi verranno inseriti in un array e poi saranno stampati.");
		for(int i = 0; i < array.length; i++){
			array[i] = Leggi.unDouble();
		}
		for(int i = array.length-1; i >= 0; i--){
			System.out.println(array[i]);
		}
	}
} 