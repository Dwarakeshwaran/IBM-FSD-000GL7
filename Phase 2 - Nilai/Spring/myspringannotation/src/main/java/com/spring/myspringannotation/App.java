package com.spring.myspringannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.myspringannotation.beans.Employee;
import com.spring.myspringannotation.beans.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeDao dao=context.getBean("eDao",EmployeeDao.class);
        dao.createEmployee(new Employee("Sachin"));

    }
}
