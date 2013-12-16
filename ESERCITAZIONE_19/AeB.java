class A {
  public int m1() {
    return 1;
  }
  
  public int m2() {
    return 2;
  }
}  

class B extends A {
  public int m2() {
    return 4;
  }
  
  public int m3() {
    return 3;
  }
}

class C extends A{
  public int m3(){
    return 6;
  }
}