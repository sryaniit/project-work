package co.surya.annotation.example;

import org.springframework.beans.factory.annotation.Value;

public class StudentwithAnnotations {
	@Value("rsp123")
	private String id;
	@Value("surrya")
	private String name;
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentwithAnnotations [id=" + id + ", name=" + name + "]";
	}

}
