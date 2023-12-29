class Hotel{
	String name;
	String ownerName;
	MenuCard menuCard;
	
	Hotel(){
		System.out.println("created no-org const....");
	}
	
	Hotel(String name,String ownerName,MenuCard menuCard){
		this.name=name;
		this.ownerName=ownerName;
		this.menuCard=menuCard;
		
	}
	
	void showInfo(){
		System.out.println("Hotel name: "+this.name);
		System.out.println("Hotel ownerName: "+this.ownerName);
		System.out.println("Hotel MenuCard: "+this.menuCard);
		if(this.menuCard!=null){
			System.out.println("Hotel totalItems: "+this.menuCard.totalItems);
			System.out.println("Per item cost: "+this.menuCard.cost);
		}
	}
}