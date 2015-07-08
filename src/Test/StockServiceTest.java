package Test;
import junit.framework.Assert;

import  org.testng.annotations.Test;

import com.mycode.StockService;

public class StockServiceTest {

	
	@Test
	public void testGetStock()
	{
		StockService stockService = new StockService();
		Assert.assertEquals(stockService.getAvailableStocks().getStatus(), 200);
		
	}
	
}
