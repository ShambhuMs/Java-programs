class WebApplication extends Application{
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication(){
		System.out.println("Running no-arg cons in WebApplication..");
	}
	
	WebApplication(String[] supportedBrowsers,boolean free){
		this.supportedBrowsers=supportedBrowsers;
		this.free=free;
		System.out.println("WebApplication free : "+this.free);
		System.out.println("SupportedBrowsers : "+this.supportedBrowsers);
		if(this.supportedBrowsers!=null){
			System.out.println("favourites length : "+this.supportedBrowsers.length);
			for(int i=0;i<supportedBrowsers.length;i++){
				String val=supportedBrowsers[i];
				System.out.println(" at: " +i+ "  supportedBrowsers : "+val);
			}
		}
	}
	
	void connectInternet(){
		System.out.println("Running connectInternet-method in WebApplication..");
	}
	
	void sendUsage(){
			System.out.println("Running sendUsage-method in WebApplication..");
	}
	
}