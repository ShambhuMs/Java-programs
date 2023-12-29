class Showroom{
	String name;
	String location;
	int pincode;
	String buildingColor;
	long contactNo;
	String ownername;
	int noOfWorker;
	
	
	Showroom(){
		System.out.println("Default values...");
	}
	
	Showroom(String name){
		this.name=name;
		System.out.println("Name is: "+name);
	}
	
	Showroom(String location,int pincode){
		this.location=location;
		this.pincode=pincode;
		System.out.println("location is:"+location);
		System.out.println("pincode is:"+pincode);
	}
	
	Showroom(String buildingColor,long contactNo){
		this.buildingColor=buildingColor;
		this.contactNo=contactNo;
		System.out.println("buildingColor is:"+buildingColor);
		System.out.println("contactNo is:"+contactNo);
	}
	
	Showroom(int pincode,int noOfWorker){
		this.pincode=pincode;
		this.noOfWorker=noOfWorker;
		System.out.println("pincode is:"+pincode);
		System.out.println("noOfWorker is:"+noOfWorker);
	}
	
	Showroom(String name,String location){
		this.name=name;
		this.location=location;
		System.out.println("Name is: "+name);
		System.out.println("location is:"+location);
	}
	
	Showroom(long contactNo){
		this.contactNo=contactNo;
		System.out.println("contactNo is:"+contactNo);
	}
	
	Showroom(int pincode,String location){
		this.pincode=pincode;
		this.location=location;
		System.out.println("pincode is:"+pincode);
		System.out.println("location is:"+location);
	}
	
	Showroom(int pincode,long contactNo){
		this.pincode=pincode;
		this.contactNo=contactNo;
		System.out.println("pincode is:"+pincode);
		System.out.println("contactNo is:"+contactNo);
	}
	
}