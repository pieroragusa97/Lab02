package it.polito.tdp.alien;
import java.util.*;

public class Dizionario {
	private TreeMap<String,Parola> parole=new TreeMap<String,Parola>();
	
	public Dizionario() {
		
	}

	public void aggiungiParola(String s1,String s2) {
		
		if(!parole.containsKey(s1)) {
			Parola p=new Parola(s1);
			parole.put(s1, p);
		    p.aggiungiTraduzione(s2);
		}
		else {
		  parole.get(s1).aggiungiTraduzione(s2);
		}
	}
	
	public String cercaParola(String s) {
		if(parole.containsKey(s))
		    return parole.get(s).elenco();
		else 
			return "Parola non presente";
	}
	
	public void cancella() {
		parole.clear();
	}

}
