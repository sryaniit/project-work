package co.surya.module2;

public class Hostel {
	private String hostelname;
	private String city;
	public Hostel(){}
	
	public String getHostelname() {
		return hostelname;
	}
	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString()
	{
return "Hostel[Hostelname=" + hostelname + ",city=" + city + "]";
}
}