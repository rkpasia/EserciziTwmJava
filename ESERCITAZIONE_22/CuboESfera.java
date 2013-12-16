class Cubo extends Figura3D{

  private float lato;

  public Cubo(float lato, float[] centro){
    this.lato = lato;
    setCentro(centro);
  }

  protected String tipoFigura(){return "Cubo ";}
  
  public double calcolaVolume(){return lato*lato*lato;}

}

class Sfera extends Figura3D{

  private float raggio;

  public Sfera(float raggio, float[] centro){
    this.raggio = raggio;
    setCentro(centro);
 }

  protected String tipoFigura(){return "Sfera ";}    
  
  public double calcolaVolume(){return ((4f/3f)*raggio*raggio*raggio*3.14f);}

}
