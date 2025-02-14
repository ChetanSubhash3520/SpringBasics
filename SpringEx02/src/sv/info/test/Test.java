package sv.info.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import sv.info.beans.Employee;

public class Test {
	
@SuppressWarnings("deprecation")
public static void main(String[]args)
{
	
	XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
	
	Employee emp=(Employee)xmlBeanFactory.getBean("empObj");
	
	System.out.println(emp);
}
	
	

}
