import java.io.*;
class MenuTesto2 {
    public static void main(String[] args) throws IOException { 
      int scelta;
      int x = 10;
      int y = 15;
      System.out.print("Quale operazione?\n1. somma\n2. sottrazione\n?");
      scelta = Leggi.unInt();
      if (scelta == 1){
        System.out.println("La somma di "+x+" e "+y+" e': "+(x+y));
      }else if (scelta == 2){
        System.out.println(x+" meno "+y+" fa "+(x-y));
      }else if (scelta != 1 && scelta != 2){
        System.out.println("Errore! Devi scegliere 1 o 2");
      }
    }
}