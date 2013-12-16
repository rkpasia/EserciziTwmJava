public class Auto extends Veicolo {

    private String modello;

    public Auto(int matricola, String proprietario, String modello){
      super.numMatricola = matricola;
      super.proprietario = proprietario;
      this.modello = modello;
    } 


    public String getModello(){
      return modello;
    }

    public String toString(){
      return "Numero di matricola: " + numMatricola + ", Proprietario: " + proprietario+", Modello: "+modello;
    }
}
