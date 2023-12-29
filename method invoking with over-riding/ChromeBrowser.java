class ChromeBrowser extends Browser{
	
	ChromeBrowser(){
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
		System.out.println("Running run-method in ChromeBrowser..");
	}
	@Override
	void stop(){
		System.out.println("Running stop-method in ChromeBrowser..");
	}
	@Override
	void execute(){
		System.out.println("Running execute-method in ChromeBrowser..");
	}
	@Override
	void collectInfo(){
		System.out.println("Running collectInfo-method in ChromeBrowser..");
	}
	@Override
	void displayInfo(){
		System.out.println("Running displayInfo-method in ChromeBrowser..");
	}
	@Override
	void consumerMemory(){
		System.out.println("Running consumerMemory-method in ChromeBrowser.." );
	}
	@Override
	void consumeInternet(){
		System.out.println("Running consumeInternet-method in ChromeBrowser.." );
	}
	@Override
	void settings(){
		System.out.println("Running settings-method in ChromeBrowser...");
	}
	
	@Override
	void displayHistory(){
		System.out.println("Running displayHistory-method in ChromeBrowser...");
	}
}