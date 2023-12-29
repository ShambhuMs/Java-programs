class FireFoxBrowser extends Browser{
	
	FireFoxBrowser(){
		this.run();
		this.stop();
		this.execute();
		this.collectInfo();
		this.displayInfo();
		this.consumeInternet();
		this.consumerMemory();
		this.settings();
		this.displayHistory();
	}
	@Override
	void run(){
		System.out.println("Running run-method in FireFoxBrowser..");
	}
	@Override
	void stop(){
		System.out.println("Running stop-method in FireFoxBrowser..");
	}
	@Override
	void execute(){
		System.out.println("Running execute-method in FireFoxBrowser..");
	}
	@Override
	void collectInfo(){
		System.out.println("Running collectInfo-method in FireFoxBrowser..");
	}
	@Override
	void displayInfo(){
		System.out.println("Running displayInfo-method in FireFoxBrowser..");
	}
	@Override
	void consumerMemory(){
		System.out.println("Running consumerMemory-method in FireFoxBrowser.." );
	}
	@Override
	void consumeInternet(){
		System.out.println("Running consumeInternet-method in FireFoxBrowser.." );
	}
	@Override
	void settings(){
		System.out.println("Running settings-method in FireFoxBrowser...");
	}
	
	@Override
	void displayHistory(){
		System.out.println("Running displayHistory-method in FireFoxBrowser...");
	}
}