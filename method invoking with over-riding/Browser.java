class Browser extends StandaloneApplication{
	String[] downloads;
	String[] browsingHistorySites;
	
	Browser(){
		System.out.println("Running no-arg cons in Browser.....");
	}
	
	Browser(String[] downloads,String[] browsingHistorySites){
		this.downloads=downloads;
		this.browsingHistorySites=browsingHistorySites;
		System.out.println("Downloads : "+this.downloads);
		if(this.downloads!=null){
			System.out.println("downloads length : "+this.downloads.length);
			for(int i=0;i<downloads.length;i++){
				String value=downloads[i];
				System.out.println(" at: " +i+ "  downloads : "+value);
			}
		}
		System.out.println("BrowsingHistorySites : "+this.browsingHistorySites);
		if(this.browsingHistorySites!=null){
			System.out.println("browsingHistorySites length : "+this.browsingHistorySites.length);
			for(int i=0;i<browsingHistorySites.length;i++){
				String val=browsingHistorySites[i];
				System.out.println(" at: " +i+ "  browsingHistorySites : "+val);
			}
		}
	}
	void settings(){
		System.out.println("Running settings-method in Browser...");
	}
	
	void displayHistory(){
		System.out.println("Running displayHistory-method in Browser...");
	}
	

}