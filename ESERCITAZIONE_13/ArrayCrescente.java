class ArrayCrescente {
	public static void main(String[] args){
		int[] array = {1,2,5,4};
		System.out.println((crescente(array)?"E' crescente" : "Non cresce"));
	}

	static boolean crescente(int[] array){
		return crescente(array,0);
	}

	static boolean crescente(int[] array, int index){
		if(index == array.length-1 ){
			return true;
		}else if(array[index]<array[index+1]){
			index++;
			return crescente(array,index);
		}else{
			return false;
		}
	}
}