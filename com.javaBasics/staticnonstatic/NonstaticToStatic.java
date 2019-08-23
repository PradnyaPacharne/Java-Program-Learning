package staticnonstatic;

public class NonstaticToStatic {
	static void add(NonstaticToStatic abc) {
		abc.sub();
	}
	void sub() {
		System.out.println("Non static method");
	}
public static void main(String[] args) {
		/*
		 * NonstaticToStatic obj = new NonstaticToStatic(); obj.add(obj);
		 */
	
	new NonstaticToStatic().add(new NonstaticToStatic());
}
}
