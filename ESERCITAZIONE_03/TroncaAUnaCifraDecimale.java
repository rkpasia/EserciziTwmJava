class TroncaAUnaCifraDecimale {
    public static void main(String[] args) {
        float x;
        x = 32.42674566f;
        System.out.println("La variabile x vale: "+x);
        int y;
        y = (int)(x*10);
        x = y/10f;
        System.out.println("La variabile x troncata a una cifra decimale: "+x);
    }
}