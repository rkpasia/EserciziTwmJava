class Program_1{

    public static void main(String[] args){
      A oggetto_a = new A();
      B oggetto_b = new B(1,2);
      oggetto_a = oggetto_b;
      System.out.println(oggetto_a.toString());
    }

  }

  class Program_2{

    public static void main(String[] args){
      A oggetto_a = new B(1,2);
      System.out.println(oggetto_a.toString());
    }

  }