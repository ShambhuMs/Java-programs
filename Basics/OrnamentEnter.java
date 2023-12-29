class OrnamentEnter{
	
	public static void main(String[] args){
		System.out.println("main start in OrnamentEnter..");
		
		Ornament ornament=new Ornament();
		System.out.println("ornament type: "+ornament.type);
		System.out.println("ornament cost: "+ornament.cost);
		System.out.println("ornament rating: "+ornament.rating);
		System.out.println("ornament quantity: "+ornament.quantity);
		System.out.println("______________________________________");
		
		Ornament ornament1=new Ornament("Gold");
		System.out.println("ornament1 type: "+ornament1.type);
		System.out.println("ornament1 cost: "+ornament1.cost);
		System.out.println("ornament1 rating: "+ornament1.rating);
		System.out.println("ornament1 quantity: "+ornament1.quantity);
		System.out.println("______________________________________");
		
		Ornament ornament2=new Ornament(48000);
		System.out.println("ornament2 type: "+ornament2.type);
		System.out.println("ornament2 cost: "+ornament2.cost);
		System.out.println("ornament2 rating: "+ornament2.rating);
		System.out.println("ornament2 quantity: "+ornament2.quantity);
		System.out.println("______________________________________");
		
		Ornament ornament3=new Ornament(49000,4.9);
		System.out.println("ornament3 type: "+ornament3.type);
		System.out.println("ornament3 cost: "+ornament3.cost);
		System.out.println("ornament3 rating: "+ornament3.rating);
		System.out.println("ornament3 quantity: "+ornament3.quantity);
		System.out.println("______________________________________");
		
		Ornament ornament4=new Ornament(1);
		System.out.println("ornament4 type: "+ornament4.type);
		System.out.println("ornament4 cost: "+ornament4.cost);
		System.out.println("ornament4 rating: "+ornament4.rating);
		System.out.println("ornament4 quantity: "+ornament4.quantity);
		System.out.println("______________________________________");
		
		
		Ornament ornament5=new Ornament("Silver",5000,4.6,2);
		System.out.println("ornament5 type: "+ornament5.type);
		System.out.println("ornament5 cost: "+ornament5.cost);
		System.out.println("ornament5 rating: "+ornament5.rating);
		System.out.println("ornament5 quantity: "+ornament5.quantity);
		System.out.println("______________________________________");
		System.out.println("main end in OrnamentEnter..");
	}
}