public class PartitaTris {
  public static void main(String[] args) {
    TrisGame game = new TrisGame();
      
    while (game.nessunVincitore() && !game.massimoMosse()){
      System.out.println(game);
      game.mossa();
      game.setVincitore();
    }
    
    System.out.println(game);
    if (game.nessunVincitore())
      System.out.println("Pari!");
    else
      System.out.println("Il vincitore e': "+game.getVincitore());

  }
}