package domain;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybatisuser {
     public static SqlSessionFactory getSession(){
    	 try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis/mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    	 
     }
}
