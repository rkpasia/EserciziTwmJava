public class Veicolo {
  protected int numMatricola;
  protected String proprietario;

  public Veicolo() {
	 numMatricola = -1;
	 proprietario = "NN";
  }

  public void setProprietario(String nome) {
	 proprietario = nome;
  }

  public String getProprietario() {
	 return proprietario;
  }

  public void setMatricola(int matricola) {
	 numMatricola = matricola;
  }

  public int getMatricola() {
	 return numMatricola;
  }

  public String toString(){
   return "Numero di matricola: " + numMatricola + ", Proprietario: " + proprietario;
  }

}