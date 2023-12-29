class EdgeBrowser extends Browser{
	
	EdgeBrowser(){
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
		System.out.println("Running run-method in EdgeBrowser..");
	}
	@Override
	void stop(){
		System.out.println("Running stop-method in EdgeBrowser..");
	}
	@Override
	void execute(){
		System.out.println("Running execute-method in EdgeBrowser..");
	}
	@Override
	void collectInfo(){
		System.out.println("Running collectInfo-method in EdgeBrowser..");
	}
	@Override
	void displayInfo(){
		System.out.println("Running displayInfo-method in EdgeBrowser..");
	}
	@Override
	void consumerMemory(){
		System.out.println("Running consumerMemory-method in EdgeBrowser.." );
	}
	@Override
	void consumeInternet(){
		System.out.println("Running consumeInternet-method in EdgeBrowser.." );
	}
	@Override
	void settings(){
		System.out.println("Running settings-method in EdgeBrowser...");
	}
	
	@Override
	void displayHistory(){
		System.out.println("Running displayHistory-method in EdgeBrowser...");
	}
}