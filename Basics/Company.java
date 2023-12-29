class Company{
	String name;
	String gstNo;
	String location;
	Job job;
	
	Company(){
		System.out.println("created no-org const....");
	}
	
	Company(String name,String gstNo,String location,Job job){
		this.name=name;
		this.gstNo=gstNo;
		this.location=location;
		this.job=job;
		
	}
	
	void showInfo(){
		System.out.println("Company name: "+this.name);
		System.out.println("Company gstNo: "+this.gstNo);
		System.out.println("Company location: "+this.location);
		System.out.println("Company job: "+this.job);
		if(this.job!=null){
			System.out.println("Company role: "+this.job.role);
			System.out.println("Company salary: "+this.job.salary);
			System.out.println("Company type: "+this.job.type);
		}
	}
}