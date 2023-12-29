class Email{
	String domain;
	int id;
	String fName;
	String lName;
	
	Email(String domain,int id,String fName,String lName){
		this.domain=domain;
		this.id=id;
		this.fName=fName;
		this.lName=lName;
	}
	
	
	void showInfo(){
		System.out.println("ShowInfo start in Email...");
			
			System.out.println("Email domain : "+this.domain);
			System.out.println("Email id : "+this.id);
			System.out.println("Email fName : "+this.fName);
			System.out.println("Email lName : "+this.lName);
		
		System.out.println("ShowInfo end in Email..");
	}
}