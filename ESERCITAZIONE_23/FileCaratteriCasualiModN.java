import java.lang.Math;
import java.io.*;

class FileCaratteriCasualiModN {
	public static void main(String[] args){
		int numeroCaratteri = Integer.parseInt(args[0],10);
		char[] caratteri = concatArgs(args).toCharArray();
		try{
			File f = new File("randomChar.txt");
			if(!f.isFile()) f.createNewFile();
			FileWriter scriviFile = new FileWriter(f);
			for(int i = 0; i < numeroCaratteri; i++){
				scriviFile.write((int)randomChar(caratteri));
			}
			scriviFile.flush();	
			scriviFile.close();
		}catch(IOException e){

		}finally{
			System.out.println("Terminato");
		}
	}

	private static String concatArgs(String[] args){
		String s = "";
		for(int i = 1; i < args.length; i++){
			s = s.concat(args[i]);
		}
		return s;
	}

	private static char randomChar(char[] caratteri){
		return caratteri[(int)Math.floor(Math.random()*caratteri.length)];
	}
}