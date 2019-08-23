package inheritance;

class Parent {
	int num1;

	Parent(int num1) {
		this.num1 = num1;
	}

	void display() {
		System.out.println("This is Parent class");
		System.out.println(num1);
	}
}

public class SingleLevelInheritance extends Parent {
	SingleLevelInheritance(int number) {
		super(number);
 
	}

	public static void main(String[] args) {
		int number = 10;
		SingleLevelInheritance obj = new SingleLevelInheritance(number);
		obj.display();
	}
}
