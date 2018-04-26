package domain;
import java.io.FileInputStream;
import java.io.IOException;  
import java.io.InputStream;  
import java.util.ArrayList;  
import java.util.List;

import dao.Studentdaoimpl;
import jxl.Cell;  
import jxl.Sheet;  
import jxl.Workbook;  
import jxl.read.biff.BiffException;  
  
public class  Testexcel{  
      
    private String filePath;  
    private List<String[]> list = new ArrayList<String[]>();  
      
    public Testexcel(String filePath){  
        this.filePath = filePath;  
    }  
      
    public List<String[]> readExcel() throws IOException, BiffException{  
        //创建输入流  
        InputStream stream = new FileInputStream(filePath);  
        //获取Excel文件对象  
        Workbook  rwb = Workbook.getWorkbook(stream);  
        //获取文件的指定工作表 默认的第一个  
        Sheet sheet = rwb.getSheet(0);    
        //行数(表头的目录不需要，从1开始)  
        for(int i=0; i<sheet.getRows(); i++){  
             //创建一个数组 用来存储每一列的值  
            String[] str = new String[sheet.getColumns()];  
            Cell cell = null;  
            //列数  
            for(int j=0; j<sheet.getColumns(); j++){  
              //获取第i行，第j列的值  
              cell = sheet.getCell(j,i);      
              str[j] = cell.getContents();  
            }  
          //把刚获取的列存入list  
          list.add(str);  
        } 
        return list;
    }  
    public String outData(){  
         for(int i=0;i<list.size();i++){  
             String[] str = (String[])list.get(i);               
            	 Student student=new Student();
            	 student.setStuid(str[0]);
            	 student.setStuname(str[1]);
            	 student.setGrade(str[2]);
            	 student.setStuphone(str[3]);
            	 student.setMother(str[4]);
            	 student.setFather(str[5]);            	 
            	 Studentdaoimpl impl=new Studentdaoimpl();            	 
            	 impl.addstudent(student);             
         }  
         return "chenggong";
    }  
      
//    public static void main(String args[]) throws BiffException, IOException{  
//    	Testexcel excel = new Testexcel("E:\\student.xls");  
//        excel.readExcel();  
//        excel.outData();  
//    }  
}