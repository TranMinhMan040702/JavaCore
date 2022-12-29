package enums;

public class MyEnum {
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		Level myLevel = Level.LOW;
		
		switch(myLevel) {
			case LOW:
				System.out.println("Low level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High level");
				break;
		}
		
		// duyet qua enum
		for (Level item : Level.values()) {
			System.out.println(item);
		}
	}
}
