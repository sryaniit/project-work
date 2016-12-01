package co.surya.annotation.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private String id;
	@Autowired
	@Qualifier("hostel2")
	private Hostel hostel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", hostel=" + hostel + "]";
	}

}
