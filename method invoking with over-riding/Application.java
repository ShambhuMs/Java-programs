class Application{
	int id;
	String name;
	ApplicationType type;
	String version;
	String developer;
	int date;
	
	Application(){
		System.out.println("Running no-arg cons in Application");
	}
	
	Application(int id,String name,ApplicationType type,String version,String developer,int date){
		this.id=id;
		this.name=name;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
		System.out.println("Application id : "+this.id);
		System.out.println("Application name : "+this.name);
		System.out.println("Application type : "+this.type);
		System.out.println("Application version : "+this.version);
		System.out.println("Application developer : "+this.developer);
		System.out.println("Application date : "+this.date);
	}
	
	void run(){
		System.out.println("Running run-method in Application..");
	}
	
	void stop(){
		System.out.println("Running stop-method in Application..");
	}
	
	void execute(){
		System.out.println("Running execute-method in Application..");
	}
	
	void collectInfo(){
		System.out.println("Running collectInfo-method in Application..");
	}
	
	void displayInfo(){
		System.out.println("Running displayInfo-method in Application..");
	}
}