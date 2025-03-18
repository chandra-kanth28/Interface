interface calculator7{
	void addition();
	void subtraction();
	default void multiplication() {
		System.out.println("multiplication");
	}
	static void division() {
		System.out.println("subtraction");
	}
}
public class interface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
