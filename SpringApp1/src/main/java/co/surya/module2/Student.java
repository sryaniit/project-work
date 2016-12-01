package co.surya.module2;

public class Student {
	private String name;
	private String id;
	private Hostel hostel;
	public Student(){}
	
	public Student(String name, String id, Hostel hostel) {
		
		this.name = name;
		this.id = id;
		this.hostel = hostel;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Hostel getHostel() {
		return hostel;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", hostel=" + hostel + "]";
	}
	

}
