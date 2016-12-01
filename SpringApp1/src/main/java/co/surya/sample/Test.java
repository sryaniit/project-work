package co.surya.sample;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import co.surya.module1.User;

public class Test {

	public static void main(String[] args) {
		
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
//		HelloWorld hello =(HelloWorld) context.getBean("HelloWorld");
//		hello.sayhello();
	//	Person person =(Person) context.getBean("Person");
	//	System.out.println(person.toString());
		User user=(User) context.getBean("user");
        System.out.println(user.getCar().toString());		
      
        context.close();  
	}

}
