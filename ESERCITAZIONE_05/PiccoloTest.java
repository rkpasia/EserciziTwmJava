import java.io.*;
class PiccoloTest {
  public static void main(String[] args) throws IOException {
    int scelta;
    int punteggio = 0;
    while(punteggio != 2){
      punteggio = 0;
      System.out.print("Quale di queste istruzioni e' corretta?\n"
                        +"1) float x = 10.5;\n"
                        +"2) float x = 10.5f;\n?");
      scelta = Leggi.unInt();
      if (scelta == 2)
        punteggio = punteggio + 1;
      System.out.print("Quale di queste istruzioni e' corretta?\n"
                        +"1) double x = 10.5f;\n"
                        +"2) double x = 10.5d;\n?");
      scelta = Leggi.unInt();
      if (scelta == 1)
        punteggio = punteggio + 1;
      System.out.println((punteggio ==2) ? "Promosso" : "Bocciato");
    }
  }
}