class TipoChar {
    public static void main(String[] args) {
        char x;
        char y;
        char z;
        x = 'a';
        y = 'b';
        System.out.println(x+y);
        System.out.println(x+""+y);
        
        for (int i = 0;i<256; i++){
            z = (char)i; 
            System.out.print(z);
        }
        System.out.println();
    }
} 