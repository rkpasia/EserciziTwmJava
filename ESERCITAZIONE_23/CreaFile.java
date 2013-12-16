import java.io.*;
class CreaFile extends File{

	public CreaFile(String path){
		super(path);
	}

	public static void main(String[] args){
		//args ==> 0 -> directory in cui creare i file | 1 -> prefisso comune | 2 -> numero file da creare | 3 -> Estensione dei file
		try{
			CreaFile file = new CreaFile(args[0]);
			if(!file.isDirectory()){file.mkdir();}
			int count = Integer.parseInt(args[2],10);
			for(int i = 0; i < count; i++){
				file = new CreaFile(args[0]+File.separatorChar+args[1]+i+args[3]);
				file.createNewFile();
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}

}