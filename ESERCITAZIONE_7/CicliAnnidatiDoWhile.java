class CicliAnnidatiDoWhile {
	public static void main(String[] args){
		int i = 1,j;
		do{
			j=1;
			do{
				System.out.print(i);
				j++;
			}while(j<=8);
			System.out.println();
			i++;
		}while(i<=8);
	}
}