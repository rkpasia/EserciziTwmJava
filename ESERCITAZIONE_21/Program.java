 class Program{

    public static void main(String[] args){
      A oggetto_a = new A();
      B oggetto_b = new B(1,2);
      oggetto_a = oggetto_b;
      System.out.println(oggetto_b.toString());
      System.out.println(oggetto_a.toString());
    }

  }