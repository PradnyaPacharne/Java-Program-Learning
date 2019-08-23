package methods;

public class CallingFromConst {
	int a, b;

	void addition() {
		int result;
		result = a + b;
		System.out.println(result);
	}

	CallingFromConst(int num1, int b) {
		a = num1;
		this.b = b;
	}

	public static void main(String[] args) {
		new CallingFromConst(10, 20).addition();
	}
}
