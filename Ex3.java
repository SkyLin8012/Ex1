interface BookStyle3{
	double BookPrice(double price);
	String BookName(String name);
}
class Ex3{
	public static void main(String[] args) 
	{
	   System.out.println("價格合計:"+(
	   	new BookStyle3(){
			public double BookPrice(double price){
				return price*0.95;
			}
	   		public String BookName(String name){
	   			return null;
	   		}

	   	}.BookPrice(1000)+
	   	new BookStyle3(){
	   		public double BookPrice(double price){
				return price*0.8;
			}
	   		public String BookName(String name){
	   			return null;
	   		}

	   	}.BookPrice(1000)	
	   	));   
	}
}