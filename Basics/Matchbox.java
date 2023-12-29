class Matchbox{
	String brand;
	int noOfSticks;
	double length;
	double price;
	int size;
	double weight;
	String type;
	
	
	Matchbox(){
		System.out.println("default values:");
	}
	
	Matchbox(String brand){
		this.brand=brand;
		System.out.println("brand is: "+brand);
	}
	
	Matchbox(int noOfSticks){
		this.noOfSticks=noOfSticks;
		System.out.println("noOfSticks is: "+noOfSticks);
	}
	
	Matchbox(double length){
		this.length=length;
		System.out.println("length is: "+length);
	}
	
	Matchbox(double price,String brand){
		this.price=price;
		this.brand=brand;
		System.out.println("price is: "+price);
		System.out.println("brand is: "+brand);
	}
	
	Matchbox(int size,double weight){
		this.size=size;
		this.weight=weight;
		System.out.println("size is: "+size);
		System.out.println("weight is: "+weight);
	}
	
	Matchbox(String type,int noOfSticks){
		this.type=type;
		this.noOfSticks=noOfSticks;
		System.out.println("type is: "+type);
		System.out.println("noOfSticks is: "+noOfSticks);
	}
	
	Matchbox(String brand,double length){
		this.brand=brand;
		this.length=length;
		System.out.println("brand is: "+brand);
		System.out.println("length is: "+length);
	}
}