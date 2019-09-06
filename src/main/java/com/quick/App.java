package com.quick;

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
        ApplicationContext cntxt=new ClassPathXmlApplicationContext("SpringModule.xml");
        TestSpEL test=(TestSpEL) cntxt.getBean("testspel");
        System.out.println(test); 
        for (Person i:test.getPeoplesByIdentifier()){
            System.out.print(i);                    
        }
        for (String name:test.getNamesOfPeopleByIdentifier()) {
            System.out.println(name);
        }
    }
}
