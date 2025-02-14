package com.chetan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chetan.beans.Admin;


public class Test {
	
	public static void main(String[]args)
	{
		ApplicationContext classPathXmlApplicationContext= new ClassPathXmlApplicationContext("beans.xml");
		Admin bean=(Admin)classPathXmlApplicationContext.getBean("aobj");
		System.out.println(bean);
	}
}
