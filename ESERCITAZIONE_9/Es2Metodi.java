class Es2Metodi {
    public static void main(String[] args) {
      System.out.println("Leggi il numero di volte che vuoi stampare 12321:");
      int ripetizioni = Leggi.unInt();
      for(int i = 1; i <= ripetizioni; i++){
        System.out.print("1");
        metodo2();
        System.out.print("1");
        System.out.println();
      }
    }
    static void metodo1() {
      System.out.print("2");
      System.out.print("2");
      metodo3();
    }
    static void metodo2() {
        System.out.print("2");
        metodo3();
        System.out.print("2");
    }
    static void metodo3() {
        System.out.print("3");
    }
}