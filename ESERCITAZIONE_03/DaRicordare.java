class DaRicordare {
  	public static void main(String[] args) {

	    System.out.println("Il file .java contiene il codice sorgente "
	                      +"e deve essere compilato.\n "
	                      +"Dopo la compilazione viene creato un file "
	                      +".class che puo' essere eseguito.\n "
	                      +"Se si cancella il .java, il programma puo' "
	                      +"ancora essere eseguito (ma non modificato). ");
  	}
}

/*

Il programma funziona perché il file .class è ancora presente nella directory e non è stato cancellato. Il file .class è il file eseguibile e compilato che viene 
creato al momento della compilazione dal file .java . Il file .java serve per modificare il programma per poi successivamente ricompilarlo e sovrascrivere il file .class.
Se cambiamo il nome al file .java per lo stesso motivo elencato nelle righe precedenti il programma verrà eseguito ugualmente.
Provando ad eseguire il programma NuovoNome otteniamo un errore per il semplice motivo che non esiste un programma compilato con quel nome, cambiando il nome ad un file .java non cambiamo
nome ad un file .class, il quale prende il nome del nostro programma all'interno del file .java.
Se proviamo a cambiare il nome ad un file .class già compilato, il nome del programma all'interno non cambierà e quindi se proviamo ad eseguirlo chiamando il nuovo nome del
file otteremo un errore.

*/