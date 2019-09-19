package com.spring.myspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.myspringapp.beans.BaseballCoach;
import com.spring.myspringapp.beans.Coach;
import com.spring.myspringapp.beans.CricketCoach;
import com.spring.myspringapp.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach myCoach = context.getBean("theEmployee",Employee.class);
        System.out.println(myCoach.getDailyWorkout() +" "+myCoach.getAddress());
    }
}
