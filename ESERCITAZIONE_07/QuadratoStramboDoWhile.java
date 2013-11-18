class QuadratoStramboDoWhile {
	public static void main(String[] args){
		int i  = 1, j;
		do{
			j = 0;
			do{
				System.out.print((i+j<=8) ? i+j : i+j-8);
				j++;
			}while(j<=7);
			i++;
			System.out.println();
		}while(i<=8);
	}
}