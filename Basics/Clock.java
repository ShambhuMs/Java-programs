class Clock{
	String brand;
	double cost;
	String color;
	String type;
	int quantity;
	
	Clock(){
		super();
		System.out.println("Default values...");
	}
	
	Clock(String brand){
		super();
		this.brand=brand;
		System.out.println("brand name is:"+brand);
	}
	
	Clock(double cost){
		super();
		this.cost=cost;
		System.out.println("cost is:"+cost);
	}
	
	Clock(String color,String type){
		super();
		this.color=color;
		this.type=type;
		System.out.println("color is:"+color);
		System.out.println("type is:"+type);
	}
		
	Clock(int quantity){
		super();
		this.quantity=quantity;
		System.out.println("quantity is:"+quantity);
	}
    
	Clock(String brand,double cost,String color,String type,int quantity){
		super();
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		this.type=type;
		this.quantity=quantity;
		System.out.println("brand name is:"+brand);
		System.out.println("cost is:"+cost);
		System.out.println("color is:"+color);
		System.out.println("type is:"+type);
		System.out.println("quantity is:"+quantity);
		
	}
}