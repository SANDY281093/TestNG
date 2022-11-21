package poly;

public class Overriding2 extends OverLoading {
public void abc() {
	System.out.println("321");
}
public static void main(String[] args) {
	Overriding2 a=new Overriding2();
	a.abc();
}
}
