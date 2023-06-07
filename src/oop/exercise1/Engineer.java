package oop.exercise1;

public class Engineer extends Officer {

	private String majors;

	public Engineer(String name, int old, String sex, String address, String majors) {
		super(name, old, sex, address);
		this.majors = majors;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	@Override
	public String toString() {
		return "Engineer [majors=" + majors + ", getName()=" + getName() + ", getOld()=" + getOld() + ", getSex()="
				+ getGender() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
