import java.awt.*;
import java.awt.event.*;

class SceltaDeiColori extends Panel{

  TextField txtRed;
  TextField txtGreen;
  TextField txtBlu;
  Panel panelColore;

  public SceltaDeiColori(){

    this.setBounds(50, 50, 150, 100);
    this.setLayout(new GridLayout(3,1));

    Panel panelSceltaColore = new Panel(new GridLayout(1,1));
    Panel panelParametriColore = new Panel(new GridLayout(1,3));
    panelColore = new Panel();


    txtRed = new TextField("150", 3);
    txtGreen = new TextField("150", 3);
    txtBlu = new TextField("150", 3);

    txtRed.addTextListener(new AscoltatoreTextField());
    txtGreen.addTextListener(new AscoltatoreTextField());
    txtBlu.addTextListener(new AscoltatoreTextField());

    panelSceltaColore.add(txtRed);
    panelSceltaColore.add(txtGreen);
    panelSceltaColore.add(txtBlu);

    panelParametriColore.add(panelSceltaColore);

    Button buttonClear = new Button("Pulisci");
    buttonClear.addActionListener(new AscoltatoreReset());

    this.add(panelColore);
    this.add(panelParametriColore);
    this.add(buttonClear);
    setVisible(true);
  }

  private void setBackgroundColor(){
    panelColore.setBackground(new Color(Integer.parseInt(txtRed.getText()),Integer.parseInt(txtGreen.getText()),Integer.parseInt(txtBlu.getText())));
  }

  private void resetBackgroundColor(){
    panelColore.setBackground(new Color(150,150,150));
    txtRed.setText("150");
    txtGreen.setText("150");
    txtBlu.setText("150");
  }

  class AscoltatoreReset implements ActionListener{

    public void actionPerformed(ActionEvent e){
      resetBackgroundColor();
    }

  }

  class AscoltatoreTextField implements TextListener{
    public void textValueChanged(TextEvent e){
      TextField field = (TextField)e.getSource();
      if(Integer.parseInt(field.getText())<0 || Integer.parseInt(field.getText())>255 || !field.getText().matches("[0-9]+")){
        field.setText("0");
      }else{
        setBackgroundColor();
      }
    }
  }
}
