package co.surya.annotation.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

 class TestClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
 FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
  Student ob =(Student) context.getBean("student1");
  Student ob1 =(Student) context.getBean("student2");
  System.out.println(ob.getName()+"-"+ob.getId());
  System.out.println(ob1.getName()+"-"+ob1.getId());
  
  
	}

}
