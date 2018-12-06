package DatDrivenFrame;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DataProviderTest {
	
	
	@Test(dataProvider="ddd")
	
	public void DP(String Username, String pwd) {
		
		System.out.println("in DP");
		
		System.out.println(Username);
		
		System.out.println(pwd);
		
		Assert.assertEquals("C", Username);
		
	
	}
	
	
	
	@DataProvider(name="ddd")
	
	public Object[][] passdata(){
		
		Object[][] ar =new Object[2][2];  // rows = 0,1 , column 0,1
		
		ar[0][0] ="A";
		ar[0][1] ="B";
		ar[1][0] ="C";
		ar[1][1] ="D";
		
		
		
		
		return ar;
		
		
	}

}
