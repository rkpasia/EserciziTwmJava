import java.io.*;
class MenuTesto {
    public static void main(String[] args) throws IOException { 
      int scelta = 0;
      int x = 10;
      int y = 15;
      System.out.print("Quale operazione?\n1. somma\n2. sottrazione\n-1. per uscire\n");
      while (scelta != -1){
        scelta = Leggi.unInt();
        if (scelta == 1)
          System.out.println("La somma di "+x+" e "+y+" e': "+(x+y));
        if (scelta == 2)
          System.out.println(x+" meno "+y+" fa "+(x-y));
        if (scelta != 1 && scelta != 2 && scelta != -1){
            System.out.println("Errore! Devi scegliere 1 o 2 o -1");
            System.out.print("Quale operazione?\n1. somma\n2. sottrazione\n3. -1 per uscire\n");
          }
        System.out.println();
      }
    }
}