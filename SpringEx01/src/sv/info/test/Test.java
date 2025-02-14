package sv.info.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import sv.info.beans.Student;



public class Test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Load Spring configuration
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));

        // Retrieve Bean
        Student bean = (Student) beanFactory.getBean("sObj");
        System.out.println(bean);
    }
}