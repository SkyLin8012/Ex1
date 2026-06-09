interface BookStyle2{
	double BookPrice(double price);
	String BookName(String name);
}
class Ex2{
	public static void main(String[] args) {
		BookStyle2 b1 = new BookStyle2(){
			public double BookPrice(double price){
				return price*0.95;
			}
			public String BookName(String name)
			{
				return name;
			}
		};
		BookStyle2 b2 = new BookStyle2(){
			public double BookPrice(double price){
				return price*0.6;
			}
			public String BookName(String name)
			{
				return name;
			}
		};


		System.out.println(b1+"\t書名:"+b1.BookName("Java11")+"\t價格"+b1.BookPrice(1000));
		System.out.println(b1+"\t書名:"+b2.BookName("Java07")+"\t價格"+b2.BookPrice(1000));
		System.out.println("價格合計:"+"價格"+b1.BookPrice(1000)+"價格"+b2.BookPrice(1000));
	}
}