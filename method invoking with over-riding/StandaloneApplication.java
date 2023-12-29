class StandaloneApplication extends Application{
	int size;
	String comapatabilewith;
	OperatingSystem opSystem;
	
	StandaloneApplication(){
		System.out.println("Running no-arg cons in standaloneApplication..");
	}
	
	StandaloneApplication(int size,String comapatabilewith,OperatingSystem opSystem){
		this.size=size;
		this.comapatabilewith=comapatabilewith;
		this.opSystem=opSystem;
		System.out.println("standaloneApplication size : "+this.size);
		System.out.println("standaloneApplication comapatabilewith : "+this.comapatabilewith);
		System.out.println("standaloneApplication opSystem : "+this.opSystem);
	}
	
	void consumerMemory(){
		System.out.println("Running consumerMemory-method in standaloneApplication.." );
	}
	
	void consumeInternet(){
		System.out.println("Running consumeInternet-method in standaloneApplication.." );
	}
} 
