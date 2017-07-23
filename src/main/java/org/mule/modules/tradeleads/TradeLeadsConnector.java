package org.mule.modules.tradeleads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.tradeleads.config.ConnectorConfig;

@Connector(name="trade-leads", friendlyName="TradeLeads")
public class TradeLeadsConnector {

    @Config
    ConnectorConfig config;
    
    private final String API_KEY = "gUXbu9HO8dehT0TdKdZEPzgq";
    String queryURL="https://api.trade.gov/v1/trade_leads/search?api_key=";
    
    
    
    /*
    {your key}&q={term}
    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&q=electrical

    	https://api.trade.gov/v1/trade_leads/search?api_key={your key}&industries={term}
    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&industries=Educational Services
    		



    	https://api.trade.gov/v1/trade_leads/search?api_key={your key}&countries={country code}
    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&countries=CN

    	https://api.trade.gov/v1/trade_leads/search?api_key={your key}&trade_regions={Region 1,Region 2}
    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&trade_regions=Asia,North America
    		
    	https://api.trade.gov/v1/trade_leads/search?api_key={your key}&world_regions={Region 1,Region 2}
    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&world_regions=Asia,North America




    	https://api.trade.gov/v1/trade_leads/search?api_key={your key}&sources={lead source}
    	Possible values of the source field: CANADA, FBO, STATE, UK, MCA, AUSTRALIA, USTDA

    	https://api.trade.gov/v1/trade_leads/search?api_key=gUXbu9HO8dehT0TdKdZEPzgq&sources=CANADA
    
    */

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    @Processor
    public String query(String query) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return getInfo(queryURL+this.API_KEY+"&q="+query);
    }
    
    @Processor
    public String industries(String sources) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return  getInfo(queryURL+this.API_KEY+"&sources="+sources);
    }
    
    @Processor
    public String countries(String finalyears) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return  getInfo(queryURL+this.API_KEY+"&final_years="+finalyears);
    }
    
    @Processor
    public String trade_regions(String trade_regions) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return  getInfo(queryURL+this.API_KEY+"&trade_regions="+trade_regions);
    }
    
    
    @Processor
    public String world_regions(String world_regions) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return  getInfo(queryURL+this.API_KEY+"&world_regions="+world_regions);
    }
    
    @Processor
    public String sources(String sources) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return  getInfo(queryURL+this.API_KEY+"&sources="+sources);
    }
    
    private String getInfo(String url){
       		StringBuffer response = new StringBuffer();
       		String resp;
       		try {
       			URL obj = new URL(url);
       			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

       			// optional default is GET
       			con.setRequestMethod("GET");

       			// add request header
       			int responseCode = con.getResponseCode();
       			System.out.println("\nSending 'GET' request to URL : " + url);
       			System.out.println("Response Code : " + responseCode);

       			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
       			String inputLine;
       			

       			while ((inputLine = in.readLine()) != null) {
       				response.append(inputLine);
       			}
       			in.close();

       			// print result
       			resp=response.toString();
       		} catch (Exception e) {
       			resp="Error getting the timezone";
       			e.printStackTrace();
       		}
       		
       		return resp;
        
    }


    
    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}