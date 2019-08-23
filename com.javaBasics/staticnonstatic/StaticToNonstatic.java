package staticnonstatic;

public class StaticToNonstatic {
 static void add() {
	 System.out.println("This is non static to static");
 }
 
 void sub() {
	 add();
 }
 
 public static void main(String[] args) {
	new StaticToNonstatic().sub();
	
 }
}
