interface BookStyle{
	double BookPrice(double price);
	String BookName(String name);
}
class Ex1{
	public static void main(String[] args) {
		BookStyle b1 = new BookStyle(){
			public double BookPrice(double price){
				return price*0.95;
			}
			public String BookName(String name)
			{
				return name;
			}
		};

		System.out.printf(b1+"\t書名:"+b1.BookName("Java11")+"\t價格"+b1.BookPrice(1000));
	}
	
}