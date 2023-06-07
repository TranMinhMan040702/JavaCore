package oop.exercise2;

public class Book extends Document {

	private String author;
	private int pageNumber;

	public Book(int id, String publisher, int code, String author, int pageNumber) {
		super(id, publisher, code);
		this.author = author;
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", pageNumber=" + pageNumber + ", getAuthor()=" + getAuthor()
				+ ", getPageNumber()=" + getPageNumber() + ", getId()=" + getId() + ", getPublisher()=" + getPublisher()
				+ ", getCode()=" + getCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
