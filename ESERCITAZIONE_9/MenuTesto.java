import java.io.*;
class MenuTesto {
    public static void main(String[] args) throws IOException { 
      int x = 10;
      int y = 15;
      System.out.print("Quale operazione?\n + per somma\n - per sottrazione\n * per moltiplicazione\n / per divisione\n");
      char operazione = Leggi.unChar();
      System.out.println(operazione(x,y,operazione));
    }
    static int operazione(int x, int y, char operando) {
      switch (operando) {
        case '+':
          return x+y;
        case '-':
          return x-y;
        case '*':
          return x*y;
        case '/':
          return x/y;
      }
      System.out.println("Errore! "+operando+" non e' un'operazione conosciuta.");
      return 0;
    }
}


  