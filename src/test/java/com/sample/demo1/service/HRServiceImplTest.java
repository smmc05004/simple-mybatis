package com.sample.demo1.service;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.sample.demo1.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/app-mybatis-tag-context.xml")
public class HRServiceImplTest {

	@Autowired
	HRService service;
	
	@Test
	public void testConfig() {
		Assert.assertNotNull(service);
	}
	
	@Test
	public void testGetAllEmployees() {
		List<Employee> employees = service.getAllEmployees();
		Assert.assertEquals(107, employees.size());
	}
}
