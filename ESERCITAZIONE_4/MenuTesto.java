import java.io.*;
class MenuTesto {
    public static void main(String[] args) throws IOException { 
      int scelta;
      int x = 10;
      int y = 15;
      System.out.print("Quale operazione?\n1. somma\n2. sottrazione\n?");
      scelta = Leggi.unInt();
      if (scelta == 1)
        System.out.println("La somma di "+x+" e "+y+" e': "+(x+y));
      if (scelta == 2)
        System.out.println(x+" meno "+y+" fa "+(x-y));
      if (scelta != 1 && scelta != 2)
        System.out.println("Errore! Devi scegliere 1 o 2");
    }
}

/*

Cosa succede se si modifica la prima istruzione di stampa in System.out.println("La somma di "+x+" e "+y+" e': "+x+y);?
Non viene più considerata la somma dei valori delle due variabili che prima veniva eseguita grazie alla precedenza garantita dalle parentesi torne,
con la modifica avviene una semplice concatenazione tra stringhe. Quindi otterremo 1015 in input se selezioniamo la somma.
Cosa succede se si modifica la seconda istruzione di stampa in System.out.println(x+" meno "+y+" fa "+x-y);?
Il compilatore invia un messaggio di errore perché, levando le parentesi, x-y viene considerata un'operazione tra stringhe. Siccome l'operazione "-" non
è applicabile alle stringhe il compilatore segnala errore. 

*/