class UniRicorsivo {
  public static void main (String[] args) {
    int[] a = {0,0,0,0,0,0,0,0,0,0};
    int[][] matrice = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
    assegnaI(a,0);
    assegnaUni(a);
    azzeraMatrice(matrice);
    assegnaI(a,0);
    for (int i = 0; i < matrice.length; i++){
      for(int j = 0; j < matrice[i].length; j++){
        System.out.print(matrice[i][j]+ " ");
      }
      System.out.println();
    }
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }

  static void azzeraMatrice(int[][] matrice){
    azzeraMatrice(matrice,0,0);
  }

  static void azzeraMatrice(int[][] matrice, int i, int j){
    if(i == matrice.length-1 && j == matrice[i].length-1){
      matrice[i][j] = 1;
    }else if(j == matrice[i].length-1){
      matrice[i][j] = 1;
      azzeraMatrice(matrice,i+1,0);
    }else{
      matrice[i][j] = 1;
      azzeraMatrice(matrice,i,j+1);
    }
  }

  static void assegnaUni(int[] v){
    assegnaUni(v,0);
  }

  static void assegnaUni(int[] v, int low) {
     if(low == v.length-1){
      v[low] = 1;
     }else{
      v[low] = 1;
      assegnaUni(v,low+1);
     }
  }
  static void assegnaI(int[] v, int low) {
     if(low == v.length-1){
      v[low] = low;
     }else{
      v[low] = low;
      assegnaI(v,low+1);
     }
  }

}