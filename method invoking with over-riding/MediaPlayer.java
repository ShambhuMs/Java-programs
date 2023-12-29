class MediaPlayer extends StandaloneApplication{
	String[] favourites;
	
	MediaPlayer(){
		System.out.println("Running no-arg cons in Mediaplayer....");
	}
	
	
	void play(String[] favourites){
		this.favourites=favourites;
		System.out.println("Favourites : "+this.favourites);
		if(this.favourites!=null){
			System.out.println("favourites length : "+this.favourites.length);
			for(int i=0;i<favourites.length;i++){
				String val=favourites[i];
				System.out.println(" at: " +i+ "  Favourites : "+val);
			}
		}
	}
	
	void delete(){
		System.out.println("Running delete-method in MediaPlayer..");
	}
	
	void download(){
		System.out.println("Running download-method in MediaPlayer..");
	}
}