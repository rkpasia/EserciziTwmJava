class CreazioneEStampaArrayWhile {
	public static void main(String[] args){
		double[] array = new double[10];
		System.out.println("Leggi 10 double, essi verranno inseriti in un array e poi saranno stampati.");
		int i = 0;
		while ( i < array.length){
			array[i] = Leggi.unDouble();
			i++;
		}
		i = 0;
		while(i < array.length){
			System.out.println(array[i]);
			i++;
		}
	}
}