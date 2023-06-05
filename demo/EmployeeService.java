package com.health.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	List<Employee> empList = new ArrayList<> ( Arrays.asList(new Employee("111","praveen","Sales"), new Employee("222","Virkant","Accounts"),new Employee("333","Sachin","marketing")));


	public List<Employee> getallEmployee() {
		
		
		return empList;
	}


	public Employee getEmp(String eid) {
	
		 Employee empresult = empList.stream().filter(b->b.getEid().equals(eid)).findFirst().get();
		
		return empresult;
	}


	public void addEmp(Employee e) {
				
		empList.add(e);
		
	}
	
	public void updateEmp(Employee e, String eid) {
		
			for(int i=0 ;i<empList.size();i++) {
			
			  Employee res = empList.get(i);
			   
			   
				   if(res.getEid().equals(eid))
				   {
					  empList.set(i,e);
				   }
			
			}
		
	}


	public void deleteEmp(String eid) {
			
		empList.removeIf(t->t.getEid().equals(eid));
		
	}
	
	
	

}
