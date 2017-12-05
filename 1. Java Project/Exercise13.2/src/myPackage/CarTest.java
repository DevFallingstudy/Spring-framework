package myPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/CarBeanDefinition.xml");
		Car car1 = (Car)context.getBean("car1");
		car1.printInfo();
		Car car2 = (Car)context.getBean("car2");
		car2.printInfo();
	}

}
