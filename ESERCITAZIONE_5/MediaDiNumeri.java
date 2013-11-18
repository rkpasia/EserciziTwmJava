class MediaDiNumeri {
    public static void main(String[] args) {
        int nsomme;
        System.out.println("Questo prigramma esegue la media tra i numeri che verranno inseriti.\nQuanti numeri vuoi inserire?");
        nsomme = Leggi.unInt();
        System.out.println("La media dei "+nsomme+" numeri e': "+sommaNumeri(nsomme));
    }
    public static float sommaNumeri(int nsomme){
        int somma=0,numero;
        int contatore = 1;
        while(contatore <= nsomme) {
            System.out.print(contatore+"? ");
            numero = Leggi.unInt();
            somma = somma + numero;
            contatore++;
        }
        return ((float)somma/nsomme);
    }
}