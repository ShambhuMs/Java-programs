class Rocket{
	String name;
	double cost;
	String metal;
	int quantity;
	
	Rocket(){
		System.out.println("default values...");
	}
	
	Rocket(String name){
		super();
		this.name=name;
		System.out.println("name is:"+name);
	}
	
	Rocket(String name,double cost){
		super();
		this.name=name;
		this.cost=cost;
		System.out.println("cost is:"+cost);
		System.out.println("name is :"+name);

	}
	
	Rocket(String name,String metal){
		super();
		this.name=name;
		this.metal=metal;
		System.out.println("name is :"+name);
		System.out.println("metal is:"+metal);
	}
	
	Rocket(int quantity){
		super();
		this.quantity=quantity;
		System.out.println("quantity is:"+quantity);
	}
	
	Rocket(String name,double cost,String metal,int quantity){
		super();
		this.name=name;
		this.cost=cost;
		this.metal=metal;
		this.quantity=quantity;
		System.out.println("name is:"+name);
		System.out.println("cost is:"+cost);
		System.out.println("metal is:"+metal);
		System.out.println("quantity is:"+quantity);
	}
	
}