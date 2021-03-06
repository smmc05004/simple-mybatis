package com.sample.demo1;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.service.HRService;
import com.sample.demo1.vo.Employee;

public class MybatisSpringApp {

	public static void main(String[] args) {
		
		//String resource = "classpath:/META-INF/spring/app-context.xml";
		//String resource = "classpath:/META-INF/spring/app-mapper-scanner-context.xml";
		String resource = "classpath:/META-INF/spring/app-mybatis-tag-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		/*
		EmployeeMapper mapper = context.getBean(EmployeeMapper.class);
		//System.out.println(mapper);
		List<Employee> employees = mapper.getAllEmployees();
		System.out.println("조회된 사원수: " + employees.size());
		*/
		HRService service = context.getBean(HRService.class);
		List<Employee> employees = service.getAllEmployees();
		System.out.println("조회된 사원수: " + employees.size());
	}
}
