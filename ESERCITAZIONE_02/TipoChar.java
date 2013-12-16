class TipoChar {
  public static void main(String[] args) {
    char x;
    char y;
    char z;
    x = 'a';
    y = 'b';
    System.out.println(x+y);
    System.out.println(x+""+y);
    z = (char)(x+y);
    System.out.println(z);
  }
}

//STAMPA IL NUMERO CORRISPONDENTE ALLA SOMMA DEL CODICE ASCII DEI DUE CARATTERI a E b, POI STAMPA ab PERCHE' FA UNA CONCATENZAZIONE GRAZIE AL + CON UNA STRINGA VUOTA "",
//POI STAMPA IL CARATTERE CORRISPONDENTE ALLA SOMMA DEL CODICE ASCII DEI DUE CARATTERI.