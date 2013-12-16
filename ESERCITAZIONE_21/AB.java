  class A {

    private int x;
    protected int y;
    public int z;

    public A(){}

    public String toString(){
      return("(this.x, "+x+") (this.y, "+y+") (this.z, "+z+")");
    }

  }


  class B extends A{

    private int v;
    private int z;

    public B(int v1, int v2){
      //this.y = v1;
      super.y = v2;
      this.z = v1;
      this.v = v1;
      this.y = v1;
      //super.y = v2;
      super.z = v2;
    }

    public static void main(String[] args){
      A oggetto_a = new A();
      B oggetto_b = new B(1,2);
      System.out.println(oggetto_b);
    }

    public String toString(){
      return "(this.v, " + v + ") (this.y, " + y + ") (this.z, " + z + ")";
    }

  }



  /*
  a) this.x = v1;//ERRORE e' privata la x
  b) this.y = v1;
  c) this.z = v1;
  d) this.v = v1;
  e) super.x = v2;//ERRORE e' privata la x
  f) super.y = v2;
  g) super.z = v2;
  h) super.v = v2;//ERRORE e' nella stessa classe di B non nella sua sovraclasse
  */