class OperatoreCondizionale {
  public static void main(String[] args) {
    boolean maggiore;
    int x;
    int y;
    maggiore = (5 > 2);
    System.out.println(maggiore?"cinque e' maggiore di due":"cinque e' minore di due");
    x = 123;
    y = 12;
    maggiore = (x > y);
    System.out.println(maggiore?"x e' maggiore di y":"x e' minore di y");
    x = 12;
    y = 123;
    maggiore = (x > y);
    System.out.println(maggiore?"x e' maggiore di y":"x e' minore di y");
  }
}