package oop.exercise1;

public class Worker extends Officer {

	private int level;

	public Worker(String name, int old, String sex, String address, int level) {
		super(name, old, sex, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Worker [level=" + level + ", getLevel()=" + getLevel() + ", getName()=" + getName() + ", getOld()="
				+ getOld() + ", getSex()=" + getGender() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
