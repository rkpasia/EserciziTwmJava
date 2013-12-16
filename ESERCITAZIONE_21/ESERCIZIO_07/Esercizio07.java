class A extends D {
  public int m1() { return 2;}
  public int m2() { return 5;}
}

class B {
  public int m1() { return 1;}
  public int m4() { return 3;}
}

class C extends D {
  public int m3() { return 7;}
  public int m5() { return 11;}
}

class D  {
  public int m3() { return 6;}
  public int m4() { return 9;}
}
class Esercizio {
  public static void main(String[] args) {
    A pippo = new A();
    C pluto = new C();
    prova(pluto);
    prova(pippo);
    
  }

  static void prova(C p){
    System.out.println(p.m3()*p.m4());
  }
  static void prova(A q){
    System.out.println(q.m1()*q.m4());
  }

}

//63,18