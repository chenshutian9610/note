package spring.test;
import org.junit.*;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.DML;
import spring.beans.DMLImple;
import spring.beans.Student;
public class SpringTest {
	@Test
	public void testOne(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DML dml=(DML)context.getBean("dml");
		dml.delete();
		dml.insert();
		dml.update();
	}

}
