import java.lang.Math;
import java.io.*;

class FileCaratteriCasuali {
	public static void main(String[] args){
		double range;
		char[] fileStream = new char[20]; 
		String s = "";
		s = s.concat(args[0].concat(args[1].concat(args[2])));
		char[] caratteri = s.toCharArray();
		try{
			File f = new File("randomChar.txt");
			if(!f.isFile()) f.createNewFile();
			FileWriter scriviFile = new FileWriter(f);
			for(int i = 0; i < 20; i++){
				range = Math.random();
				if(range <= 0.33){
					scriviFile.write((int)caratteri[0]);
				}else if(range > 0.33 && range <=0.66 ){
					scriviFile.write((int)caratteri[1]);
				}else{
					scriviFile.write((int)caratteri[2]);
				}
			}
			scriviFile.flush();	
			scriviFile.close();
		}catch(IOException e){

		}finally{
			System.out.println("Terminato");
		}
	}
}