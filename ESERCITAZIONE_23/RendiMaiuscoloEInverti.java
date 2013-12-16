import java.io.*;

class RendiMaiuscoloEInverti {
	public static void main(String[] args){
		try{
			File file = new File(Leggi.unoString());
			System.out.println(file.getName()+" e' il nome del file sorgente.");
			FileReader leggiFile = new FileReader(file);
			File nuovoFile = new File(Leggi.unoString());
			System.out.println(nuovoFile.getName()+" e' il nome del file destinazione.");
			char[] fileMaiuscolo = new char[(int)file.length()];
			int c;
			if(!nuovoFile.isFile()){
				for(int i = 0; i < file.length(); i++){
					c = (int)leggiFile.read();
					if(c >= 97 && c <= 122)
						fileMaiuscolo[i] = (char)(c-32);
					else 
						fileMaiuscolo[i] = (char)c;
				}
			}else{
				System.out.println("Errore: il file da scrivere esiste gia'!");
			}
			System.out.println("Il file sorgente contiene: "+ new String(fileMaiuscolo));
			nuovoFile.createNewFile();
			FileWriter fileScrittura = new FileWriter(nuovoFile);
			for(int i = (int)file.length()-1; i >= 0; i--){
				fileScrittura.write((int)fileMaiuscolo[i]);
			}
			fileScrittura.flush();
			fileScrittura.close();
		}catch(FileNotFoundException e){
			System.out.println("Errore il file da aprire non esiste! ->"+e);
		}catch(IOException e){

		}
	}
}