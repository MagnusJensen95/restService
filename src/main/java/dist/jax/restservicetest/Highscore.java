package dist.jax.restservicetest;

import java.awt.List;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import galgeleg.soap.GalgeISOAP;

public class Highscore {
	
	private int words;
	private String name;
	
	
	public Highscore(){}
	
	
	public Highscore(int score, String name){
		
		this.words = score;
		this.name = name;
		
	}
	
	
	public int getWords() {
		return words;
	}
	public void setWords(int words) {
		this.words = words;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getHighscores() throws Exception{
		URL url = new URL("http://ec2-35-165-42-120.us-west-2.compute.amazonaws.com:9901/galgeSOAP?wsdl");
		QName qname = new QName("http://soap.galgeleg/", "GalgelogikImplService");
		  Service service = Service.create(url, qname);
		 GalgeISOAP ba = service.getPort(GalgeISOAP.class);
		
		return ba.getHighscore();
		
		
	}
	

	 

	
}
