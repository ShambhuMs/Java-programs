class Clinic{
	String specialization;
	int totalBed;
	int totalPatient;
	Docter docter;
	
	Clinic(String specialization,int totalBed,int totalPatient,Docter docter){
		this.specialization=specialization;
		this.totalBed=totalBed;
		this.totalPatient=totalPatient;
		this.docter=docter;
	}
	
	void showInfo(){
		System.out.println("Clinic specialization: "+this.specialization);
		System.out.println("Totalbed: "+this.totalBed);
		System.out.println("Totalpatient : "+this.totalPatient);
		System.out.println("Docter :"+this.docter);
		if(docter!=null){
			System.out.println("Docter name: "+this.docter.name);
			System.out.println("Experience : "+this.docter.exp);
			System.out.println(" Fake : "+this.docter.fake);
			System.out.println("Fees : "+this.docter.fees);
		}
	}
}