package it.polito.tdp.alien;
import java.util.*;

public class Dizionario {
	private TreeMap<String,Parola> parole=new TreeMap<String,Parola>();
	
	public Dizionario() {
		
	}

	public void aggiungiParola(String s,Parola p) {
		if(!parole.containsKey(s))
		  parole.put(s, p);
		else
			parole.replace(s, parole.get(s), p);
	}
	
	public String cercaParola(String s) {
		if(parole.containsKey(s))
		    return parole.get(s).getParolaTradotta();
		else 
			return "Parola non presente";
	}
	
	public void cancella() {
		parole.clear();
	}

}
