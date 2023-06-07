package oop.exercise1;

public class Employee extends Officer {

	private String work;

	public Employee(String name, int old, String sex, String address, String work) {
		super(name, old, sex, address);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Employee [work=" + work + ", getWork()=" + getWork() + ", getName()=" + getName() + ", getOld()="
				+ getOld() + ", getSex()=" + getGender() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
