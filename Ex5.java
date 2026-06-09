interface BookStyle4{
	String BookMsg(double price,String name);
	
}

class Ex5{
	public static void main(String[] args) {
		BookStyle4 b1 = new BookStyle4(){
		   public String BookMsg(double price,String name)
		   {
		   	 return ("書名:"+name+"\t價格:"+price);
		   }
		};
		System.out.println(b1.BookMsg(1000,"java11"));
		/*
        精簡的 Lambda 語法：因為 BookStyle4 只有一個抽象方法（屬於功能性介面），
        所以可以直接寫 (price, name) -> ...。
        連參數的型態（double 和 String）都可以省略，Java 會自動幫你推導
		*/
		BookStyle4 b2 = ( double price,String name)->"書名:"+name+"\t價格:"+price*0.8;
		
		BookStyle4 b3 = ( price, name)->"書名:"+name+"\t價格:"+price*0.7;

		BookStyle4 b4 = ( p,n)->"書名:"+n+"\t價格:"+(p*0.6);

		BookStyle4 b5 = (price,name)->{
			String show =null;
			if(price >2000) show="書名:"+name+("\t價格:"+price*0.5);
			else if(price >1500) show="書名:"+name+("\t價格:"+price*0.6);
			else if(price >1000) show="書名:"+name+("\t價格:"+price*0.7);
			return show;
		};
		//兩個一上只能用匿名
		/*
        回傳值處理：如果 Lambda 的主體只有單一行程式碼，
        不需要寫大括號 {} 和 return 關鍵字，
        它會自動將該行的結果回傳。
		*/
		System.out.println(b2.BookMsg(1000,"java11"));
		System.out.println("==================================");
		System.out.println(b2.BookMsg(2000,"java萬用11"));
		System.out.println("==================================");
		System.out.println(b4.BookMsg(800,"java練習"));
		System.out.println("==================================");
		System.out.println(b5.BookMsg(1500,"java寶典"));
	}
}