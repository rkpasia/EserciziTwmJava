class VotoFinale2 {
    public static void main(String[] args) {
        float votoProvetta1;
        float votoProvetta2;
        float votoOrale;
        float voto;
        votoProvetta1 = 30f;
        votoProvetta2 = 17f;
        votoOrale = 25f;
        voto = (votoProvetta2<18 ? 0 : ((votoProvetta1+votoProvetta2)/2+votoOrale)/2);
        System.out.print("Il voto finale e': ");
        System.out.println((int)voto);
    }
}