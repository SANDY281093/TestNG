package poly;

public class OverLoading {
	
	private void client() {
		System.out.println("Details");

	}
private void client(String name) {
	System.out.println(name);
}
public static void main(String[] args) {
	
	OverLoading a=new OverLoading();
	a.client();
	a.client("santhosh");
}
}
