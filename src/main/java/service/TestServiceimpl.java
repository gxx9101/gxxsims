package service;


import java.util.List;


import org.springframework.stereotype.Service;

import dao.Testdaoimpl;
import domain.Test;
@Service
public class TestServiceimpl implements TestService {	    
    public List<Test> findalltest(){ 
    	Testdaoimpl impl=new Testdaoimpl();
    	List<Test> testlist=impl.findalltest();    	
    	return testlist;
    }
}
