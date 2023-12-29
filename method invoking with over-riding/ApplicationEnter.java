class ApplicationEnter{
	
	public static void main (String... args){
		System.out.println(".........Main start in ApplicationEnter......");
		
		
		Application app=new Application(12345,"Firefox",ApplicationType.WEB,"version 8.21","Asis",2008);
		app.run();
		app.stop();
		app.execute();
		app.collectInfo();
		app.displayInfo();
		System.out.println("============================================");
		System.out.println("============================================");
		
		StandaloneApplication sn=new StandaloneApplication(200,"OS",OperatingSystem.MAC);
		sn.consumerMemory();
		sn.consumeInternet();
		System.out.println("============================================");
		System.out.println("============================================");
		
		WebApplication wb=new WebApplication();
		String[] sup={"Internet Explorer","Microsoft edge","Internet Explorer 10"};
		WebApplication web=new WebApplication(sup,true);
		wb.connectInternet();
		wb.sendUsage();
		System.out.println("============================================");		
		System.out.println("============================================");
		
		Browser browser=new Browser();
		String[] downloads={"intellij","JDK","Chat gpt","Git hub"};
		String[] browsingHistorySites={"Youtube","Greek","Oracle","Xworkz"};
		Browser browser1=new Browser(downloads,browsingHistorySites);
		browser.settings();
		browser.displayHistory();
		
		System.out.println("============================================");		
		System.out.println("============================================");
		MediaPlayer mp=new MediaPlayer();
		mp.delete();
		mp.download();
		String[] favourite={"Mx Player","VLC","CL MediaPlayer","Films&Tv","Video Player"}; 
		mp.play(favourite);
		
		System.out.println("============================================");		
		System.out.println("============================================");
		
		ChromeBrowser cb= new ChromeBrowser();
		
		System.out.println("============================================");
		
		EdgeBrowser edge=new EdgeBrowser();
		
		System.out.println("============================================");
		
		FireFoxBrowser fire=new FireFoxBrowser();
		
		System.out.println("============================================");
		System.out.println("============================================");
		
		
		
		
		System.out.println(".........Main end in ApplicationEnter......");

	}
}