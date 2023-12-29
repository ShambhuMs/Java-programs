class Course{
    String instName;
	String period;
	String course;
	String location;
	long pincode;
	double timing;
	int noOfStudents;
	
	Course(String instName,String course,String period,String location,long pincode,double timing,int noOfStudents){
		this.instName=instName;
		this.course=course;
		this.period=period;
		this.location=location;
		this.pincode=pincode;
		this.timing=timing;
		this.noOfStudents=noOfStudents;
		System.out.println("String,int,String,long,double....."+instName+","+course+","+period+","+location+","+pincode+","+timing+","+noOfStudents);
	}
	
	void displayInfo(){
		System.out.println(" instituteName :"+this.instName);
		System.out.println("Course name is: "+this.course);
		System.out.println("Course period is: "+this.period);
		System.out.println("Course  location is: "+this.location);
		System.out.println("Course pincode is: "+this.pincode);
		System.out.println("Course timing is: "+this.timing);
		System.out.println("noOfStudents in Course: "+this.noOfStudents);
	}
}