package dist.jax.restservicetest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.json.JSONArray;
import org.json.JSONObject;



@Path("scores")
public class Scores {


	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String jensen() throws Exception{
		Highscore scores = new Highscore();
		return null;
		
        //URL url = new URL("http://localhost:9901/galgeSOAP?wsdl");
	  
	  
		
	//	return scores.getHighscores();
		
	}
	
	@POST
	public void putScore(String score){
		
		
	}
	
	@GET
	@Path("array")
	@Produces(MediaType.APPLICATION_JSON)
	public String getScores() throws Exception{
		
		Highscore hs = new Highscore();
		 
		String HS = hs.getHighscores();
		JSONArray gg = new JSONArray(HS);
		
		return HS;
		
//			score.add(new Highscore(2, "jensen"));
//			score.add(new Highscore(3, "magnus"));
//			score.add(new Highscore(4, "pleb"));
//			score.add(new Highscore(5, "nus"));
//			score.add(new Highscore(6, "biAAS"));
//		
//        //URL url = new URL("http://localhost:9901/galgeSOAP?wsdl");
//	  
//	  
//		
//		return score;
		
	}

}
