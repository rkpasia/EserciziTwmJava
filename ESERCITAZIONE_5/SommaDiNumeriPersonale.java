class SommaDiNumeriPersonale {
    public static void main(String[] args) {
        int nsomme = 1;
        System.out.println("Quanti numeri vuoi sommare?");
        nsomme  = Leggi.unInt();
        System.out.println("La somma dei "+nsomme+" numeri e': "+sommaNumeri(nsomme));
    }
    public static int sommaNumeri(int nsomme){
        int somma = 0,numero,contatore = 1;
        while(contatore <= nsomme) {
            System.out.print(contatore+"? ");
            numero = Leggi.unInt();
            somma = somma + numero;
            contatore++;
        }
        return somma;
    }
}