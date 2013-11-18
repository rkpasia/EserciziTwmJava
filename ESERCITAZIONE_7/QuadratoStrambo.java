class QuadratoStrambo {
	public static void main(String[] args){
		for(int i = 1; i<=8; i++){
			for (int j = 0; j<=7; j++) {
				System.out.print((i+j<=8) ? i+j : i+j-8);
			}
			System.out.println();
		}
	}
}