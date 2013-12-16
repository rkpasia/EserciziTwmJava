import java.util.*;
import java.util.regex.*;
class UsoAPI2 {
	public static void main(String[] args){
		String s1 = "cbcabcqmasdasdaapcab";
		String s2 = "cq*pc";
		String ns1 = s2.substring(0,s2.indexOf("*"));
		String ns2 = s2.substring(s2.indexOf("*")+1);
		if(s1.indexOf(ns1)<s1.lastIndexOf(ns2)){
			System.out.println("La sequenza della seconda stringa e' contenuta nella prima a partire dalla posizione: "+s1.indexOf(ns1));
		}else{
			System.out.println("La seconda stringa non e' contenuta nella prima.");
		}
	}
}