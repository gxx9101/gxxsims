package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Test;

public class Testdaoimpl implements Testdao {

	public List<Test> findalltest() {
		List<Test> testlist=new ArrayList<Test>();
		 
		Test test1=new Test();
		test1.setTid("121");
		test1.setDeparture_add("SHN");
		test1.setDestination_add("LOA");
		test1.setDeparture_time("1305");
		test1.setArrival_time("1825");
		test1.setPrice("67.8");
		test1.setUname_code("C93832");
		testlist.add(test1);
		Test test2=new Test();
		test2.setTid("122");
		test2.setDeparture_add("HND");
		test2.setDestination_add("ALA");
		test2.setDeparture_time("0640");
		test2.setArrival_time("1135");
		test2.setPrice("127");
		test2.setUname_code("D85414");
		testlist.add(test2);
		Test test3=new Test();		
		test3.setTid("123");
		test3.setDeparture_add("JFK");
		test3.setDestination_add("DAM");
		test3.setDeparture_time("0755");
		test3.setArrival_time("2235");
		test3.setPrice("458");
		test3.setUname_code("A58451");
		testlist.add(test3);
		return testlist;
	}
	

}
