class Technology{
	 String techName;
     String instName;
	 String usability; //user friendly
	 String impact; //update
	 String fuctionality;//problem solving
	 double duration;
	 double cost;
	 String efficiency;//speed
	 String security;
	 long noOfTech;
	 long noOfTechCompany;
	 long technologists;
	 
	 
	 Technology(String techName,String instName,String usability,String impact,String fuctionality,double duration,long cost,String efficiency,String security,long noOfTech,long noOfTechCompany,long technologists){
		 this.techName=techName;
		 this.instName=instName;
		 this.usability=usability;
		 this.impact=impact;
		 this.fuctionality=fuctionality;
		 this.duration=duration;
		 this.cost=cost;
		 this.efficiency=efficiency;
		 this.security=security;
		 this.noOfTech=noOfTech;
		 this.noOfTechCompany=noOfTechCompany;
		 this.technologists=technologists;
		 System.out.println("String,String,String,String,String,double,double,String,String,long,long & long ....."+techName+","+instName+","+usability+","+impact+","+fuctionality+","+duration+","+cost+","+efficiency+","+security+","+noOfTech+","+noOfTechCompany+","+technologists);
	 } 
	 
	 void displayInfo(){
		 System.out.println("Technology name: "+this.techName);
		 System.out.println("Institute name: "+this.instName);
		 System.out.println("Useability : "+this.usability);
		 System.out.println("impact: "+this.impact);
		 System.out.println("fuctionality: "+this.fuctionality);
		 System.out.println("duration : "+this.duration);
		 System.out.println("Technology cost: "+this.cost);
		 System.out.println("Technology efficiency: "+this.efficiency);
		 System.out.println("Technology security: "+this.security);
		 System.out.println(" noOfTech: "+this.noOfTech);
		 System.out.println("noOfTechCompany: "+this.noOfTechCompany);
		 System.out.println("technologists: "+this.technologists);
	 }

}