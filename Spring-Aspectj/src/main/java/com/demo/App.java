package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		Operations e = (Operations) appContext.getBean("opBean");
		
		System.out.println( "Calling msg..." );
		e.msg();
				
		System.out.println( "Calling m..." );
		e.m();
		
		System.out.println( "Calling k..." );
		e.k();
    }
}
