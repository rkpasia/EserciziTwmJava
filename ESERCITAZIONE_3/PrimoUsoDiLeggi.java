class PrimoUsoDiLeggi {
    public static void main (String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean t;
        char c;
        String x;
        System.out.print("Leggi un byte:");
        b = Leggi.unByte();
        System.out.println("Il valore inserito è:"+b);
        System.out.print("Leggi uno short:");
        s = Leggi.unoShort();
        System.out.println("Il valore inserito è:"+s);
        System.out.print("Leggi un int:");
        i = Leggi.unInt();
        System.out.println("Il valore inserito è:"+i);
        System.out.print("Leggi un long:");
        l = Leggi.unLong();
        System.out.println("Il valore inserito è:"+l);
        System.out.print("Leggi un float:");
        f = Leggi.unFloat();
        System.out.println("Il valore inserito è:"+f);
        System.out.print("Leggi un double:");
        d = Leggi.unDouble();
        System.out.println("Il valore inserito è:"+d);
        System.out.print("Leggi un boolean:");
        t = Leggi.unBoolean();
        System.out.println("Il valore inserito è:"+t);
        System.out.print("Leggi un char:");
        c = Leggi.unChar();
        System.out.println("Il valore inserito è:"+c);
        System.out.print("Leggi uno string:");
        x = Leggi.unoString();
        System.out.println("Il valore inserito è:"+x);
    }
}