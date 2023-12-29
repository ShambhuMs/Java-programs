class Hospital{
	String location;
	String name;
	HospitalType type;
	int noOfbed;
	int noOfDoctor;
	String sector;
	double rating;
	boolean medicalShop;
	int availableDay;
	int noOfWorker;
	
	
	
	Hospital(){
		System.out.println("Running no-arg cons in Hospital..");
	}
	
	Hospital(String location,String name,HospitalType type,int noOfbed,int noOfDoctor,String sector,double rating,boolean medicalShop,int availableDay,int noOfWorker){
		this.location=location;
		this.name=name;
		this.type=type;
		this.noOfbed=noOfbed;
		this.noOfDoctor=noOfDoctor;
		this.sector=sector;
		this.rating=rating;
		this.medicalShop=medicalShop;
		this.availableDay=availableDay;
		this.noOfWorker=noOfWorker;
		System.out.println(" location : "+this.location);
		System.out.println(" name : "+this.name);
		System.out.println(" type : "+this.type);
		System.out.println(" noOfbed : "+this.noOfbed);
		System.out.println(" noOfDoctor : "+this.noOfDoctor);
		System.out.println(" sector : "+this.sector);
		System.out.println(" rating : "+this.rating);
		System.out.println(" medicalShop : "+this.medicalShop);
		System.out.println(" availableDay : "+this.availableDay);
		System.out.println(" noOfWorker : "+this.noOfWorker);
		
		
	}
	
	
	
	void treatement(String location){
		this.location=location;
		System.out.println("Hospital location : "+this.location);
	}
	
	void treatement(String location,String name){
		this.location=location;
		this.name=name;
		System.out.println("Hospital location : "+this.location);
		System.out.println("Hospital name : "+this.name);
	}
	
	
	void open(){
		System.out.println("Running open in Hospital..");
	}
	
	void close(){
		System.out.println("Running close in Hospital..");
	}
	
	void security(){
		System.out.println("Running security in Hospital..");
	}
	
	void patient(){
		System.out.println("Running patient in Hospital..");
	}
	
	void setType(){
		System.out.println("Running setType in Hospital..");
	}
	
	void setRating(){
		System.out.println("Running setRating in Hospital..");
	}
	
	void setNoOfbed(){
		System.out.println("Running noOfbed in Hospital..");
	}
	
	void ambulance(){
		System.out.println("Running ambulance in Hospital..");
	}
	
	void setNoOfWorker(){
		System.out.println("Running noOfWorker in Hospital..");
	}
	
	void setNoOfDoctor(){
		System.out.println("Running noOfDoctor in Hospital..");
	}
}