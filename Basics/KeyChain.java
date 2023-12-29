class KeyChain{
	String color;
	double cost;
	String shape;
	double weight;
	int quantity;
	
	KeyChain(){
		this("Black","circle",16.7,50,1);
		System.out.println("Without orgument values...");
	}
	
	KeyChain(String color){
	
		this.color=color;
		System.out.println("String is:"+color);
	}
	
	KeyChain(String color,double weight){
		this(color);
		this.weight=weight;
		System.out.println("double & String is:"+weight+","+color);
	}
	
	KeyChain(String color,double weight,double cost,int quantity){
		this(color,weight);
		this.cost=cost;
		this.quantity=quantity;
		System.out.println("String,double,double&int is:"+color+","+weight+","+cost+","+quantity);
		
	}
	
	KeyChain(String color,String shape,double weight,double cost,int quantity){
		this(color,weight,cost,quantity);
		this.shape=shape;
		System.out.println("String,double,String,double&int is:"+color+","+cost+","+shape+","+weight+","+quantity);
	}
	
}