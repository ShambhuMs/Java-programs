class Ornament{
	String type;
	double cost;
	double rating;
	int quantity;
	
	Ornament(){
		super();
		System.out.println("default values...");
	}
	
	Ornament(String type){
		super();
		this.type=type;
		System.out.println("type is:"+type);
		
	}
	
	Ornament(double cost){
		super();
		this.cost=cost;
		System.out.println("cost is:"+cost);
	}
	
	Ornament(double cost, double rating){
		super();
		this.cost=cost;
		this.rating=rating;
		System.out.println("cost is:"+cost);
		System.out.println("rating is:"+rating);
	}
	
	Ornament(int quantity){
		super();
		this.quantity=quantity;
		System.out.println("quantity is:"+quantity);
	}
	
	Ornament(String type,double cost,double rating,int quantity){
		super();
		this.type=type;
		this.cost=cost;
		this.rating=rating;
		this.quantity=quantity;
		System.out.println("type is:"+type);
		System.out.println("cost is:"+cost);
		System.out.println("rating is:"+rating);
		System.out.println("quantity is:"+quantity);
	}
}