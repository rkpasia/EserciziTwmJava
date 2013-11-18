class TroncaADueCifreDecimali {
    public static void main(String[] args) {
        float x;
        x = 32.42674566f;
        System.out.println("La variabile x vale: "+x);
        int y;
        y = (int)(x*100);
        x = y/100f;
        System.out.println("La variabile x troncata a due cifre decimali: "+x);
    }
}


/*
  SE MODIFICO x = y/100f CON x = y/100
  Alla variabile x verrà assegnato il valore 32.0 perché nella penultima istruzione viene eseguita una divisione tra interi e quindi non ci sarà un resto.
  SE MODIFICO y = (int)(x*100) IN y = x*100 
  Il compilatore mi restituirà un messaggio di errore perchè la variabile x è un float e la moltiplicazione viene eseguita con un letterale intero (100),
  siccome non viene eseguito un cast implicito bisogna forzarlo con [(int)] dichiarando di compiere la moltiplicazione tra un float e int con una perdita di precisione.
  SE MODIFICO y= (int)(x*100) IN y= (int)x*100
  Forzerò la variabile x a fare un cast ad int, quindi perderò tutte le cifre decimali dopo 32 e successivamente moltiplico la x troncata per 100.
  Questo restituirà in output 32.0 perchè dalla prima moltiplicazione otterrò 3200 e successivamente dividendo per /100f verrà eseguito un cast implicito a float. 
*/