class order{
	void show(){
		System.out.println("Hello 1");
	}
}

class Ex4{
	public static void main(String[] args) {
		var o1 = new order(){
			public void show(){
				System.out.println("Hello Java");

			}
			public void abc(){
				System.out.println("abc");
			}
		};
		order o2 = new order();

		o1.show();
		o1.abc();
		o2.show();
	}
}