
package co.surya.module2;

public class Book {
	private String name;
	private String author;
	private int noofpages;
	private float cost;
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", noofpages=" + noofpages + ", cost=" + cost + "]";
	}

}
