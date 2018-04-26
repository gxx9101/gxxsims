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
        //����������  
        InputStream stream = new FileInputStream(filePath);  
        //��ȡExcel�ļ�����  
        Workbook  rwb = Workbook.getWorkbook(stream);  
        //��ȡ�ļ���ָ�������� Ĭ�ϵĵ�һ��  
        Sheet sheet = rwb.getSheet(0);    
        //����(��ͷ��Ŀ¼����Ҫ����1��ʼ)  
        for(int i=0; i<sheet.getRows(); i++){  
             //����һ������ �����洢ÿһ�е�ֵ  
            String[] str = new String[sheet.getColumns()];  
            Cell cell = null;  
            //����  
            for(int j=0; j<sheet.getColumns(); j++){  
              //��ȡ��i�У���j�е�ֵ  
              cell = sheet.getCell(j,i);      
              str[j] = cell.getContents();  
            }  
          //�Ѹջ�ȡ���д���list  
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