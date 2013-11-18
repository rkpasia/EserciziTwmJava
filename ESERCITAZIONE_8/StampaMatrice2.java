class StampaMatrice2 {
  	public static void main(String[] args) {
    	int[][] x = {{1,2,3},{2,3,1},{3,1,2}};
    	for (int i = 0; i< x.length; i++) {
      		for (int j = 0; j < x[i].length; j++)
        		System.out.print(x[i][j]);
        	System.out.println();
    	}
 	}
}