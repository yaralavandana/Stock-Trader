package com.mycode;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/stockService")
public class StockService {

	
	@GET
	@Produces("application/json")
	public Response getAvailableStocks() {
 
		String []stocks={"Apple Inc","Google"};
     return Response.status(200).entity(stocks[0]+stocks[1]).build();
		
	}
	
	@Path("{stockId}")
	  @POST
	  @Produces("application/json")
	  public Response buyStock(@PathParam("stockId") float stockId) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		//logic to retrive a stock based on the ID
		jsonObject.put("stockId", stockId); 
		

		String result = "Thansk for buying stock" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	
	
	@Path("{stockId}")
	  @POST
	  @Produces("application/json")
	  public Response sellStock(@PathParam("stockId") float stockId) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		//logic to sell a stock based on the ID
		jsonObject.put("stockId", stockId); 
		

		String result = "Thansk for selling stock" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	
}
