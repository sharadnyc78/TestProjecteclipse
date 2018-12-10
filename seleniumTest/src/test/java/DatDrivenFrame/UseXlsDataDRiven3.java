package DatDrivenFrame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseXlsDataDRiven3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		@Test(dataProvider="ddd")
		
		public void DP(String Username, String pwd) {
			
		
			
			System.out.println(Username);
			
			System.out.println(pwd);
			
			//Assert.assertEquals("C", Username);
			
		
		}
		
		
		
		@DataProvider(name="ddd")
		
		public Object[][] passdata() throws IOException{
			
			
			File scr=new File("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\Excelsheets\\TestData.xlsx");
			
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


