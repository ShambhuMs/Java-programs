class Remote{
	UsedFor usedFor;
	int totalButtons;
	boolean original;
	
	Remote(){
		System.out.println("Running no-arg cons in Remote");
	}
	
	Remote(UsedFor usedFor,int totalButtons,boolean original){
		this.usedFor=usedFor;
		this.totalButtons=totalButtons;
		this.original=original;
		System.out.println("UsedFor : "+this.usedFor);
		System.out.println("TotalButtons : "+this.totalButtons);
		System.out.println("Original : "+this.original);
	}
	
	void on(){
		System.out.println("Running On-method in Remote...");
	}
	
	void off(){
		System.out.println("Running Off-method in Remote...");
	}
	
	void increaseVolume(){
		System.out.println("Running increaseVolume-method in Remote...");
	}
	
	void decreaseVolume(){
		System.out.println("Running decreaseVolume-method in Remote...");
	}
	
	void changeChannel(){
		System.out.println("Running changeChannel-method in Remote..");
	}
}