public class inher {

	public class a {
		public void show() {
			System.out.println("hi");
		}
	}
	
	public class a1 extends a {
		public void dhow() {
			System.out.println("hii");
		}
	}
	
	public static void main(String[] args) {
		inher outer = new inher();
		a1 obj = outer.new a1();  
		obj.dhow();
	}
}