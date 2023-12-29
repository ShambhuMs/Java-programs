class Keyboard{
	String brand;
	String color;
	int noOfKeys;
	String type;
	double cost;
	
	
	Keyboard(){
		System.out.println("Default values: ");
	}
	
	Keyboard(String brand){
		this.brand=brand;
		System.out.println("brand name is : "+brand);
	}
	
	Keyboard(String color,double cost){
		this.color=color;
		this.cost=cost;
		System.out.println("color is:"+color);
		System.out.println("cost is:"+cost);
	}
	
	Keyboard(int noOfKeys){
		this.noOfKeys=noOfKeys;
		System.out.println("noOfKeys: "+noOfKeys);
	}
	
	Keyboard(String type,String color){
		this.type=type;
		this.brand=brand;
		System.out.println("type is:"+type);
		System.out.println("color is:"+color);
	}
	
	Keyboard(double cost,String brand){
		this.cost=cost;
		this.brand=brand;
		System.out.println("changed cost is:"+cost);
		System.out.println("changed brand name is:"+brand);
	}
	
	Keyboard(String color, int noOfKeys){
		this.color=color;
		this.noOfKeys=noOfKeys;
		System.out.println("color is:"+color);
		System.out.println("noOfKeys: "+noOfKeys);
	}
}