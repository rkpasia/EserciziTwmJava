class TrovaMassimoRicorsivo {
	public static void main(String[] args){
		int[] array = {1,5,3,4,5,45,1234,1,3,2,452,4,2,66,843,1};
		System.out.println(massimo(array,0,array.length-1));
	}

	static int massimo(int[] array, int inf, int sup){
		if(inf == sup){
			return array[sup];
		}else{
			return Math.max(massimo(array,inf,(inf+sup)/2),massimo(array,((inf+sup)/2)+1,sup));
		}
	}
}