import java.lang.Math.*;
class Arrotondamento {
	public static void main(String[] args){	
		System.out.println((arrotonda(Leggi.unDouble(),Leggi.unInt())));
	}

	static double arrotonda(double numero, int decimali){
		int conversione,unita;
		if(decimali == 0){
			unita = (int)(numero*10) % 10;
			if(unita >= 5){
				conversione = (int)(numero*10);
				return ((conversione/(10))+1);
			}else{
				conversione = (int)(numero*(10));
				return (conversione/(10));
			}
		}else{
			conversione = (int)(numero*(Math.pow(10.0,decimali)));
			return (conversione/(Math.pow(10.0,decimali)));
		}
	}
}