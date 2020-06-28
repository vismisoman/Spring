package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Customer.xml");
       // CustomerService custServ = (CustomerService) appContext.getBean("customerService");
        /* To call before Advice, enable below code  */
       // CustomerService custServ1 = (CustomerService) appContext.getBean("customerServiceProxy");
        CustService custServ = (CustService) appContext.getBean("customerServiceProxy");
        custServ.printName();
        System.out.println("*********************");
        custServ.printUrl();
        System.out.println("*********************");
        try {
        	custServ.printThrowException();
        }catch(Exception e){
        	
        }
    }
}
