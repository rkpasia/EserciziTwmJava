class VotoFinale3 {
    public static void main(String[] args) {
      float votoProvetta1;
      float votoProvetta2;
      float votoScritto;
      float votoOrale;
      float voto;
      boolean esameSuperato;
      votoProvetta1 = 16f;
      votoProvetta2 = 30f;
      votoScritto = 0f;
      votoOrale = 30f;
      voto = votoProvetta1<14 ? (votoScritto+votoOrale)/2
               : (votoProvetta2<14 ? (votoScritto+votoOrale)/2 
               : ((votoProvetta1+votoProvetta2)/2+votoOrale)/2);
      esameSuperato = voto >= 18;
      System.out.println(esameSuperato?"Promosso":"Bocciato");
    }
}