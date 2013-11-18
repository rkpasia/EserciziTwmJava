class Es1Metodi {
    public static void main(String[] args) {
      System.out.print("1");
      metodo2();
      System.out.print("1");
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