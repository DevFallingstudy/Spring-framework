package myPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Employee empYang = (Employee)context.getBean("emp1");
		printInfo(empYang);
		Employee empYu = (Employee)context.getBean("emp2");
		printInfo(empYu);
	}
	
	private static void printInfo(Employee emp) {
		System.out.printf("Employee %s has id %s\n", emp.getName(), emp.getID());
	}

}
