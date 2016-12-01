package co.surya.module2;

public class Ebook extends Book{
	private float sizeinmb;

	public void setSizeinmb(int sizeinmb) {
		this.sizeinmb = sizeinmb;
	}

	@Override
	public String toString() {
		return "Ebook [sizeinmb=" + sizeinmb +","+super.toString()+ "]";
	}
	



}
