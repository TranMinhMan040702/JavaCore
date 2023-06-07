package oop.exercise2;

public class Newspaper extends Document {

	private String date;

	public Newspaper(int id, String publisher, int code, String date) {
		super(id, publisher, code);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Newspaper [date=" + date + ", getDate()=" + getDate() + ", getId()=" + getId() + ", getPublisher()="
				+ getPublisher() + ", getCode()=" + getCode() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
