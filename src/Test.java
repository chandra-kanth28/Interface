
public class Test {

	public static void main(String[] args) {
		calculator1 c1=new calculator();
		calculator1 c2;
		calculator1 c3=new
				calculator() {
			@Override
			public
			void add() {
				System.out.println("inside add method of main method");
			}
			@Override
			public
			void sub() {
				System.out.println("inside sub method of main method");
			}
		};
		c3.add();
		c3.sub();
		

	}

}
