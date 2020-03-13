package Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.ItemDetails;

public class Excel {
	  private static String[] columns = { "ID", "Item_NAME", "caloeries/per 100gm"};
	  
	   static List<ItemDetails> veg = new ArrayList<ItemDetails>();
   
	   
	    public void writefromExcel(ItemDetails items)  throws IOException{
		                      
		  veg.add(items);
		  createExcel(items);
		  
		  
		veg.add(new ItemDetails(1 ," Banana"," 50 Cals"));
		veg.add(new ItemDetails(2," Biscuit digestives" , " 40 cals"));}
	

		private void createExcel(ItemDetails items) throws IOException {
	
	XSSFWorkbook workbook = new XSSFWorkbook(); 
	
	
	XSSFSheet sheet = workbook.createSheet("calorie");
	
	
    Row headerRow = sheet.createRow(0);

    for (int i = 0; i < columns.length; i++) {
      Cell cell = headerRow.createCell(i);
      cell.setCellValue(columns[i]);
    }

    int rowNum = 1;

    for (ItemDetails veg : veg) {
      Row row = sheet.createRow(rowNum++);
      row.createCell(0).setCellValue(veg.id);
      row.createCell(1).setCellValue(veg.item);
      row.createCell(2).setCellValue(veg.calories);
      
  	System.out.print(veg.getId());
  	System.out.println(veg.getItem());
  	System.out.println(veg.getCalories());

    }
    
   
    for (int i = 0; i < columns.length; i++) {
      sheet.autoSizeColumn(i);
    }
    
    

    FileOutputStream out = new FileOutputStream(new File("calorie.xls"));
    workbook.write(out);
    workbook.close();
    out.close();
    System.out.println("Data written succesfully.");
    

  }

}
