class CoppiaInt{

	private int x;
	private int y;

	public CoppiaInt(int primo, int secondo){
		x = primo;
		y = secondo;
	}

	public static int GetPrimo(CoppiaInt c){
		return c.x;
	}

	public static int GetSecondo(CoppiaInt c){
		return c.y;
	}

	public static void SetPrimo(CoppiaInt c, int primo){
		c.x = primo;
	}

	public static void SetSecondo(CoppiaInt c, int secondo){
		c.y = secondo;
	}

	public static void ScambiaElementi(CoppiaInt c){
		int appoggio = c.y;
		c.y = c.x;
		c.x = appoggio;
	}
}

class TestCoppiaInt {
	public static void main(String[] args){
		CoppiaInt prova = new CoppiaInt(1,2);
		CoppiaInt.ScambiaElementi(prova);
		System.out.println(CoppiaInt.GetSecondo(prova));
	}
}