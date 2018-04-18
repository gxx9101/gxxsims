package domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dao.Studentdaoimpl;



public class Testexcel {
	//记录类的输出信息
   Log log=LogFactory.getLog(Testexcel.class);
   //获取excel文档的路径；.xlsx文件用XSSFWorkbook  .xlx用的HSSFWorkbook；
   //public static String filepath="D://demoExcel.xlsx";
   @SuppressWarnings("deprecation")
public static void start(String path){
	   XSSFWorkbook wookbook;
	   try{
		   wookbook=new XSSFWorkbook(new FileInputStream(path));
		   XSSFSheet sheet=wookbook.getSheet("sheet1");
		   int rows=sheet.getPhysicalNumberOfRows();
		   for(int i=0;i<rows;i++){
			   XSSFRow row=sheet.getRow(i);
			   if(row!=null){
				   int cells=row.getPhysicalNumberOfCells();
				   String value="";
				   for(int j=0;j<cells;j++){
					   XSSFCell cell=row.getCell(j);
					   if(cell!=null){
						   switch(cell.getCellType()){
						   case XSSFCell.CELL_TYPE_FORMULA:
						       break;
						  case XSSFCell.CELL_TYPE_NUMERIC:
							   value+=cell.getNumericCellValue()+",";
						       break;
						   case XSSFCell.CELL_TYPE_STRING:
							   value+=cell.getStringCellValue()+",";
							   break;
							   default:
								   value+=0;
						   }
					   }
				   }
				   
				   String [] val=value.split(",");
				   Student student=new Student();
				   student.setStuid(val[0]);
				   student.setStuname(val[1]);
				   student.setGrade(val[2]);
				   student.setStuphone(val[3]);
				   student.setMother(val[4]);
				   student.setFather(val[5]);
				   Studentdaoimpl impl=new Studentdaoimpl();
				   int p=impl.addstudent(student);
				   if(p>0){
					   System.out.println("导入成功");
				   }
				   else {
					   System.out.println("导入失败");
				   }
			   }
		   }
	   }
	   catch (FileNotFoundException e){
		   e.printStackTrace();
	   }catch(IOException e){
		   e.printStackTrace();
	   }
   }
}
