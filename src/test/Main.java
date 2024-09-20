package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[] args) {
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student1=(Student)factory.getBean("student1");  
    Student student2=(Student)factory.getBean("student2");  
    System.out.println(student1.getName()+" "+student1.getAge()); 
    System.out.println(student2.getName()+" "+student2.getAge()); 
}
}
