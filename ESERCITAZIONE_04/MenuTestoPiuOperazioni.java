import java.io.*;
class MenuTestoPiuOperazioni {
    public static void main(String[] args) throws IOException { 
      int scelta;
      int x = 10;
      int y = 15;
      System.out.print("Quale operazione?\n1. somma\n2. sottrazione\n3. moltiplicazione\n4. divisione\n");
      scelta = Leggi.unInt();
      if(scelta==0 || scelta > 4){
        System.out.println("Errore! Devi scegliere 1 o 2 o 3 o 4");
      }else {
        switch (scelta){
          case 1:System.out.println("La somma di "+x+" e "+y+" e': "+(x+y));
          break;
          case 2:System.out.println(x+" meno "+y+" fa "+(x-y));
          break;
          case 3:System.out.println(x+" moltiplicato "+y+" fa "+(x*y));
          break;
          case 4:System.out.println(x+" diviso "+y+" fa "+(x/y));
          break;
        }
      }        
    }
}