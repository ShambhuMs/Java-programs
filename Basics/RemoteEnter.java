class RemoteEnter{
	
	public static void main(String... args){
		System.out.println("...Main start in RemoteEnter...");
		
		LgRemote lg=new LgRemote(2,3,UsedFor.TV,15,true);
		lg.voiceCommand();
		lg.on();
		lg.off();
		System.out.println("===============================");
		
		Remote remote=new Remote();
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeChannel();
		
		
		System.out.println("...Main End in RemoteEnter...");
	}
}