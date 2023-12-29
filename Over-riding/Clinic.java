class Clinic extends Hospital{
	String clinicName;
	String docName;
	
	Clinic(){
		System.out.println("Running no-arg cons in Clinic");
	}
	
	Clinic(String location,String name,HospitalType type,int noOfbed,int noOfDoctor,String sector,double rating,boolean medicalShop,int availableDay,int noOfWorker,String clinicName,String docName){
		super(location,name,type,noOfbed,noOfDoctor,sector,rating,medicalShop,availableDay,noOfWorker);
		this.clinicName=clinicName;
		this.docName=docName;
		System.out.println(" clinicName : "+this.clinicName);
		System.out.println(" docName : "+this.docName);
		
		
	}
	
	void clinicOpen(){
		System.out.println("Running open in Clinic..");
	}
	
	void clinicClose(){
		System.out.println("Running close in Clinic..");
	}
	
	void setDoc(){
		System.out.println("Running doc in Clinic..");
	}
	
	void treat(){
		System.out.println("Running treat in Clinic..");
	}
	
	@Override
	void open(){
		System.out.println("Running open in Clinic..");
	}
	
	@Override
	void close(){
		System.out.println("Running close in Clinic..");
	}
	
	@Override
	void treatement(String location,String clinicName){
		this.location=location;
		this.clinicName=clinicName;
		System.out.println(" clinicName : "+this.clinicName);
		System.out.println(" location : "+this.location);
	}
	
	@Override
	void patient(){
		System.out.println("Running patient in Clinic..");
	}
}