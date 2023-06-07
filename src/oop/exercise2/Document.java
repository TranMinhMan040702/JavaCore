package oop.exercise2;

public class Document {

	private int id;
	private String publisher;
	private int code;

	public Document() {
		super();
	}

	public Document(int id, String publisher, int code) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
