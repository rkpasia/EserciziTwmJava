import java.awt.*;
import java.awt.event.*;

class GUI extends Frame {

  public GUI() {
    setSize(400,70);
    setLocation(100,100);
    setLayout(new GridLayout(1,3));
    Button b1 = new Button("Crea File");
    Button b2 = new Button("Leggi File");
    Button b3 = new Button("Cancella File");
    b1.addActionListener(new AscoltatoriPulsanti("bottone1"));
    b2.addActionListener(new AscoltatoriPulsanti("bottone2"));
    b3.addActionListener(new AscoltatoriPulsanti("bottone3"));
    add(b1);
    add(b2);
    add(b3);
    addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e){
    		System.exit(0);
    	}
    });
    setVisible(true);
  }

  class AscoltatoriPulsanti implements ActionListener{

    private String bottone;

    public AscoltatoriPulsanti(String bottone){
      this.bottone = bottone;
    }


     public void actionPerformed(ActionEvent e){
      System.out.println(bottone+ " premuto");
     }
    
  }
}