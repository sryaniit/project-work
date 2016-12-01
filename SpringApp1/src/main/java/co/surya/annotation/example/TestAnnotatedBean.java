package co.surya.annotation.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import co.surya.module2.Student;

public class TestAnnotatedBean {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("ContextAddedbean");
	
//		StudentwithAnnotations student1 =(StudentwithAnnotations) context.getBean("student1");
//		System.out.println("student1");
		
//		StudentwithAnnotations student2 =(StudentwithAnnotations) context.getBean("student2");
		System.out.println("student2");
//	
		Student studentwithhostel = (Student)context.getBean("Student");
		  System.out.println("studentwithhostel");
		context.close();
	}

}
