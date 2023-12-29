class Placement{
	String compName;
	String candName;
	int batchYear;
	int noOfvacancy;
	String qualification;
	int age;
	String interDate;
	int noOfRounds;
	int noOfCandidate;
	int noOfHR;
	String timing;
	String document;
	
	Placement(String compName,String candName,int batchYear,int noOfvacancy,String qualification,int age,String interDate,int noOfRounds,int noOfCandidate,int noOfHR,String timing,String document){
		this.compName=compName;
		this.candName=candName;
		this.batchYear=batchYear;
		this.noOfvacancy=noOfvacancy;
		this.qualification=qualification;
		this.age=age;
		this.interDate=interDate;
		this.noOfRounds=noOfRounds;
		this.noOfCandidate=noOfCandidate;
		this.noOfHR=noOfHR;
		this.timing=timing;
		this.document=document;
		System.out.println("String,String,int,int,String,int,String,int,int,int,String & String....."+compName+","+candName+","+batchYear+","+noOfvacancy+","+qualification+","+age+","+interDate+","+noOfRounds+","+noOfCandidate+","+noOfHR+","+timing+","+document);
	}
	
	void displayInfo(){
		System.out.println("Company name: "+this.compName);
		System.out.println("Candidate name: "+this.candName);
		System.out.println("Cand batchYear: "+this.batchYear);
		System.out.println("noOfvacancy: "+this.noOfvacancy);
		System.out.println("candidate qualification: "+this.qualification);
		System.out.println("Candidate age: "+this.age);
		System.out.println("Interview date: "+this.interDate);
		System.out.println("noOfRounds: "+this.noOfRounds);
		System.out.println("noOfCandidate: "+this.noOfCandidate);
		System.out.println("noOfHR: "+this.noOfHR);
		System.out.println("Interview timing: "+this.timing);
		System.out.println("candidate document: "+this.document);
	}
}