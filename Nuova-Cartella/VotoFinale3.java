class VotoFinale3 {
    public static void main(String[] args) {
      float votoProvetta1;
      float votoProvetta2;
      float votoScritto;
      float votoOrale;
      float voto;
      boolean esameSuperato;
      votoProvetta1 = 17f;
      votoProvetta2 = 15f;
      votoScritto = 17f;
      votoOrale = 25f;
      voto = votoProvetta1<18 ? (votoScritto+votoOrale)/2
               : (votoProvetta2<18 ? (votoScritto+votoOrale)/2 
               : ((votoProvetta1+votoProvetta2)/2+votoOrale)/2);
      esameSuperato = voto >= 18;
      System.out.println(esameSuperato?"Promosso":"Bocciato");
    }
}