import java.awt.*;
public class ProvaSceltaDeiColori {
  public static void main(String[] args) {
    Frame finestraProva = new Frame();
    finestraProva.setResizable(false);
    SceltaDeiColori myPanel = new SceltaDeiColori();
    finestraProva.add(myPanel);
    finestraProva.setVisible(true);
    finestraProva.pack();
  }
}