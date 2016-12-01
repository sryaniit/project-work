package co.surya.module2;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans2.xml");
	Student student=(Student) context.getBean("Student");
	System.out.println(student.toString());
	Ebook book =(Ebook)context.getBean("ebook");
	System.out.println(book.toString());
	context.close();
	}

}
