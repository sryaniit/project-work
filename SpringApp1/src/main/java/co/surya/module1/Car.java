package co.surya.module1;

public class Car {
	private String name;
	private int paypercost;
	public void setName(String name) {
		this.name = name;
	}
	public void setPaypercost(int paypercost) {
		this.paypercost = paypercost;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", paypercost=" + paypercost + "]";
	}

}
