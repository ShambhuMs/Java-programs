class Free{
	String period;
	String course;
	String location;
	long pincode;
	double timing;
	
	Free(String course,String period,String location,long pincode,double timing){
		this.course=course;
		this.period=period;
		this.location=location;
		this.pincode=pincode;
		this.timing=timing;
		System.out.println("String,int,String,long,double....."+course+","+period+","+location+","+pincode+","+timing);
	}
	
	void displayInfo(){
		System.out.println(" Free Course name is: "+this.course);
		System.out.println("Free Course period is: "+this.period);
		System.out.println("Free Course location is: "+this.location);
		System.out.println("Free Course pincode is: "+this.pincode);
		System.out.println("Free Course timing is: "+this.timing);
	}
}