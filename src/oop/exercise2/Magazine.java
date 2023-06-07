package oop.exercise2;

public class Magazine extends Document {

	private int issueNo;

	private int month;

	public Magazine(int id, String publisher, int code, int issueNo, int month) {
		super(id, publisher, code);
		this.issueNo = issueNo;
		this.month = month <= 12 && month >= 0 ? month : 1;
	}

	public int getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
