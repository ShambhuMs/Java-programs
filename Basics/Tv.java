class Tv{
	boolean display=true;
	Speaker speaker;
	
	Tv(){
		System.out.println("created no-org const...");
	}
	
	Tv(Speaker speaker){
	
		this.speaker=speaker;
		
	}
	
	void showInfo(){
		System.out.println("display : "+this.display);
		System.out.println("speaker: "+this.speaker);
		if(this.speaker!=null){
			System.out.println("maxVolume: "+this.speaker.maxVolume);
		}
	}
}