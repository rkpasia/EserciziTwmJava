class UsoAPI {
	public static void main(String[] args){
		String s1 = "acabfesdabcab";
		String s2 = "ab";
		if(s1.contains(s2)){
			int occorrenze = 1;
			int indice = s1.indexOf(s2)+1;
			while(s1.indexOf(s2,indice)!= -1){
				indice = s1.indexOf(s2,indice)+1;
				occorrenze++;
			}
			System.out.println(occorrenze);
		}else{
			System.out.println("La stringa da cercare non e' contenuta nell'altra.");
		}
	}
}