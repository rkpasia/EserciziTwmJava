class TerzaCifraDecimale {
    public static void main(String[] args) {
        float x;
        x = 32.42674566f;
        System.out.println("La variabile x vale: "+x);
        int y;
        y = (int)(x*1000);
        System.out.println("La terza cifra decimale è: "+y%10);
    }
}