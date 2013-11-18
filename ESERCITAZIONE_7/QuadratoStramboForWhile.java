class QuadratoStramboForWhile {
	public static void main(String[] args){
		int j;
		for(int i = 1; i<=8; i++){
			j = 0;
			while(j<=7){
				System.out.print((i+j<=8) ? i+j : i+j-8);
				j++;
			}
			System.out.println();
		}
	}
}