package SeleniumTC;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Library.TestBase;

public class TestB_Rsystems5 extends TestBase {
	
	String screenshotname;

	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;

    @Test
	
	public void takeScreenshotWhenFailandPass() throws IOException, InterruptedException  {
    	
    
    	
       reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Reports\\report5.html"); // give the path for report geneartion
        
        
        
       // reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\Reports\\ExtentReportDemo.html"); // give the path for report geneartion
        
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
		
		
	    logger = extent.createTest("Test 1");
		
		logger.log(Status.INFO, "Test started - 1");
		
		logger.log(Status.PASS, "Passed -1");
		
// test 1 		
	    Openbrowser("Chrome");
	    
	    String appurl="https://www.rsystems.com/";
	    
	    Navigate(appurl);
		
		
		     logger.log(Status.PASS, "Opening Browser");
		
		     capturescreenshot("Open Browser"); // CAPTURE SCREENSHOT ON PASS
		
		     logger.pass("test pass -- Open Browser pass", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Open Browser" +".png").build());

    }
		     // test 2	- use test data to search for multiple times
		     
		     
		     
	@Test(dataProvider="ddd")
		     
		     public void testdata(String xpath_search, String Search_text) throws IOException {
		
		xpath_search= "//input[@id='txtSearch']";
		    	
		      //System.out.println(sendtext);
		     
		     sendkeys(xpath_search, Search_text);
		     
		     logger.log(Status.PASS, "data");
				
		     capturescreenshot("data"); // CAPTURE SCREENSHOT ON PASS
		
		     logger.pass("test pass -- data", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"data" +".png").build());

		     
		     extent.flush();
		     
		     }
    	

    
   
		     
		@DataProvider(name="ddd")
				
				public Object[][] passdata() throws IOException{
					
					
					File scr=new File("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\Excelsheets\\search_rsys.xlsx");
					
					// obtains input byte  from a file , reads data 
					FileInputStream fis = new FileInputStream(scr);
				
					// interstingly Maven was not enough needed to add poi api externally in to build path
					
					
					
					//data has been put in xssf workbook so that poi can read data from .xlsx
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					
					XSSFSheet sheet1 = wb.getSheetAt(0); // sheet 1 choosen at index 0
					
					String User= sheet1.getRow(0).getCell(0).getStringCellValue();
					
					System.out.println(User);
					
					String Pwd = sheet1.getRow(0).getCell(1).getStringCellValue(); // pwd is row 0 , cell 1
					System.out.println(Pwd);
					
					int rowindex = sheet1.getLastRowNum(); // this gives one less as index stars from 0
					
					int rowCount = rowindex+1;
					
					int columns = sheet1.getRow(0).getLastCellNum();  // this is useful
					
					System.out.println("columns are : " + columns);
					
					
					System.out.println("total rows : " + rowCount);  // 10 data will show as 0 to 9 , answer is 9
					
									

					
				
				
						
					Object[][] ar =new Object[rowCount][columns];  // rows = 0,1 , column 0,1
					

					for(int i=0;i<rowCount;i++) {
						for(int y=0; y<columns;y++)
						
						
						ar[i][y] = sheet1.getRow(i).getCell(y).getStringCellValue();
						
					}

					

					return ar;
					
					
		    
		     
    	
    	
    		}
		
	
		
}
    

