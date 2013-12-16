// 				SECONDA VERSIONE ESERCIZIO .6
/*
class UsaCoppiaInt {
	public static void main(String[] args){
		CoppiaInt a = new CoppiaInt(12,56);
		StampaCoppiaInt(a);
		System.out.println("Questo e' il secondo componente della coppia:" + CoppiaInt.GetSecondo(a));
		CoppiaInt b = new CoppiaInt(34,111);
		StampaCoppiaInt(b);
		CoppiaInt x = new CoppiaInt(CoppiaInt.GetPrimo(a),CoppiaInt.GetSecondo(b));
		StampaCoppiaInt(x);
		CoppiaInt c = new CoppiaInt(Leggi.unInt(),Leggi.unInt());
		StampaCoppiaInt(c);
		System.out.println("Primo elemento di c: "+CoppiaInt.GetPrimo(c));
		StampaCoppiaInt(c);
		CoppiaInt.ScambiaElementi(c);
		StampaCoppiaInt(c);
		System.out.println("Primo elemento di c: "+CoppiaInt.GetPrimo(c));
		CoppiaInt.SetSecondo(a,CoppiaInt.GetPrimo(c));
		StampaCoppiaInt(a);
		CoppiaInt.SetSecondo(b,Leggi.unInt());
		StampaCoppiaInt(b);
	}

	static void StampaCoppiaInt(CoppiaInt coppia){
		System.out.println("[ "+CoppiaInt.GetPrimo(coppia)+" | "+CoppiaInt.GetSecondo(coppia)+" ]");
	}
}*/


// 				PRIMA VERSIONE ESERCIZIO .5

class UsaCoppiaInt {
	public static void main(String[] args){
		CoppiaInt a = new CoppiaInt(12,56);
		System.out.println("Questo e' il secondo componente della coppia:" + CoppiaInt.GetSecondo(a));
		CoppiaInt b = new CoppiaInt(34,111);
		CoppiaInt x = new CoppiaInt(CoppiaInt.GetPrimo(a),CoppiaInt.GetSecondo(b));
		CoppiaInt c = new CoppiaInt(Leggi.unInt(),Leggi.unInt());
		System.out.println("Primo elemento di c: "+CoppiaInt.GetPrimo(c));
		CoppiaInt.ScambiaElementi(c);
		System.out.println("Primo elemento di c: "+CoppiaInt.GetPrimo(c));
		CoppiaInt.SetSecondo(a,CoppiaInt.GetPrimo(c));
		CoppiaInt.SetSecondo(b,Leggi.unInt());
	}
}

