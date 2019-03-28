package it.polito.tdp.alien;
import java.util.LinkedList;;

public class Parola {
    private String ParolaAliena;
    private LinkedList<String> traduzioni=new LinkedList<String>();
    
	public Parola(String parolaAliena) {
		ParolaAliena = parolaAliena;
	}

	public String getParolaAliena() {
		return ParolaAliena;
	}

	public void aggiungiTraduzione(String s) {
		int presente=0;
		for(String t:traduzioni) {
			if(t.compareTo(s)==0)
				presente=1;
		}
		if(presente==0)
		traduzioni.add(s);
	}
	
	public String elenco() {
		String elenco="";
		for(String t:traduzioni) {
			if(traduzioni.getLast().compareTo(t)!=0)
			elenco+=t+"\n";
			else 
				elenco+=t;
		}
		return elenco;
	}
    
}
