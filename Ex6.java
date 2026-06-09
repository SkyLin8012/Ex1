interface BookStyle6{
	String BookMsg(double price,String name);
	
}
class Ex6{
	public static void main(String[] args) {
		//陣列宣告
		BookStyle6[]  b1= new BookStyle6[3];
		//使用方法參照，指向C1的靜態方法
		b1[0] = C1::BookMsg1;
		b1[1] = C1::BookMsg2;
		b1[2] = C1::BookMsg3;
		/*使用 Lambda 運算式呼叫C1
		b1[0] = (price,name)-> c1.BookMsg1(price,name);
		b1[1] = (price,name)-> c1.BookMsg2(price,name);
		b1[2] = (price,name)-> c1.BookMsg3(price,name);

		*/
		System.out.println(b1[0].BookMsg(1000,"JAVA大全"));
		System.out.println(b1[1].BookMsg(1000,"MY SQL 指導"));
		System.out.println(b1[2].BookMsg(2500,"演算法導論"));



	}
}
class C1{
	public static String BookMsg1(double price,String name){
		return "書名:"+name+"\t價格:"+price*0.9;
	}
	public static String BookMsg2(double price,String name){
	return "書名:"+name+"\t價格:"+price*0.9;
	}
	public static String BookMsg3(double price,String name){
		    String show=null;
			if(price >=2000) show="書名:"+name+("\t價格:"+price*0.5);
			else if(price >=1500) show="書名:"+name+("\t價格:"+price*0.6);
			else if(price >=1000) show="書名:"+name+("\t價格:"+price*0.7);
			return show;
	}
}