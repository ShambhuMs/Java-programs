class LgRemote extends Remote{
	int warranty;
	int totalBatteries;
	
	LgRemote(){
		System.out.println("Running no-arg cons in LgRemote..");
	}
	
	LgRemote(int warranty,int totalBatteries,UsedFor usedFor,int totalButtons,boolean original){
		super(usedFor,totalButtons,original);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
		System.out.println("Warranty : "+this.warranty);
		System.out.println("TotalBatteries : "+this.totalBatteries);
	}
	
	void voiceCommand(){
		System.out.println("Running voiceCommand-method in LgRemote..");
	}
	
	@Override
	void on(){
		System.out.println("Running On-method in LgRemote...");
	}
	
	@Override
	void off(){
		System.out.println("Running Off-method in LgRemote...");
	}
	
}