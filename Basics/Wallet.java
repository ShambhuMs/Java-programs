class Wallet{
	String brand;
	int quantity;
	String type;
	double cost;
	
	Wallet(){
		super();
		System.out.println("default values...");
	}
	
	Wallet(String brand){
		super();
		this.brand=brand;
		System.out.println("brand is: "+brand);
	}
	
	Wallet(int quantity){
		super();
		this.quantity=quantity;
		System.out.println("quantity is: "+quantity);
	}
	
	Wallet(String brand,String type){
		super();
		this.brand=brand;
		this.type=type;
		System.out.println("brand is: "+brand);
		System.out.println("type is: "+type);
	}
	
	Wallet(double cost){
		super();
		this.cost=cost;
		System.out.println("cost is: "+cost);
	}
	
	Wallet(String brand,int quantity,String type,double cost){
		super();
		this.brand=brand;
		this.quantity=quantity;
		this.type=type;
		this.cost=cost;
		System.out.println("brand is: "+brand);
		System.out.println("quantity is: "+quantity);
		System.out.println("type is: "+type);
		System.out.println("cost is: "+cost);
	}
}