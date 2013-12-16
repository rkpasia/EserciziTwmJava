class A extends C {
  public int m1() {
    return 10;
  }
}

class B extends A {
  public int m2() {
    return 7;
  }
}

class C {
  public int m2() {
    return 3;
  }

  public int m3() {
    return 1;
  }
}
