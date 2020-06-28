package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setEid(101);
		e.setEname("John Mathew");
		e.setSalary(3000);
		System.out.println(e);
		
		// Spring way || IOC
		//1. Add Jar file for Spring Core
		//2. Configure Java Object in an XML file
		//3. Use Spring IOC Container. eg. BeanFacotry or ApplicationContext to get the objects constructed by them
/*		
		// 1. BeanFactory Spring container		
		Resource resource = new ClassPathResource("employeebean.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println("-------- Spring IOC in Action------------");
		
		Employee em1 = (Employee)factory.getBean("emp1");
		Employee em2 = factory.getBean("emp1",Employee.class);
		
		System.out.println("employee details em1"+em1);
		System.out.println("employee details em2"+em2);
		
		// 2. ApplicationContext Spring container		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp1",Employee.class);
		
		System.out.println(e1);
		System.out.println(e2);
*/		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		
		System.out.println("employee details "+e1);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close(); //Close the context
		
		
	}

}
