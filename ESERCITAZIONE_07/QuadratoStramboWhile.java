class QuadratoStramboWhile {
	public static void main(String[] args){
		int i  = 1, j;
		while(i<=8){
			j = 0;
			while(j<=7){
				System.out.print((i+j<=8) ? i+j : i+j-8);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}