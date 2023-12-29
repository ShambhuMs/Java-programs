class Bracelet{
	String name;
	double cost;
	String shape;
	double weight;
	int quantity;
	
	Bracelet(){
		this("star","circle",24.6,50,1);
		System.out.println("Without orgument values...");
	}
	
	Bracelet(String name){
	
		this.name=name;
		System.out.println("String is:"+name);
	}
	
	Bracelet(String name,double weight){
		this(name);
		this.weight=weight;
		System.out.println("double & String is:"+weight+","+name);
	}
	
	Bracelet(String name,double weight,double cost,int quantity){
		this(name,weight);
		this.cost=cost;
		this.quantity=quantity;
		System.out.println("String,double,double&int is:"+name+","+weight+","+cost+","+quantity);
		
	}
	
	Bracelet(String name,String shape,double weight,double cost,int quantity){
		this(name,weight,cost,quantity);
		this.shape=shape;
		System.out.println("String,double,String,double&int is:"+name+","+cost+","+shape+","+weight+","+quantity);
	}
	
}