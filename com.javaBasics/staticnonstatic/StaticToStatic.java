package staticnonstatic;

public class StaticToStatic {
	static void add() {
		System.out.println("Static method add");
		StaticToStatic.sub();
		sub();
	}
	
	static void sub() {
		System.out.println("Static method sub");
	}
public static void main(String[] args) {
	add();
	StaticToStatic.sub();
	
}
}
