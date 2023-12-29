class Restaurent{
	String ownerName;
	String[] specialItems;
	
	
	Restaurent(){
		System.out.println(" created Restaurent with no-org const... ");
		
	}
	
	Restaurent(String ownerName,String[] specialItems){
		this.ownerName=ownerName;
		this.specialItems=specialItems;
	}
	
	
	void showInfo(){
		System.out.println("Starting showInfo in Restaurent....");
		System.out.println("ownerName is : "+this.ownerName);
		System.out.println("specialItems are : "+this.specialItems);
		if(this.specialItems!=null){
			System.out.println("SpecialItem length is :"+this.specialItems.length);
			for(int i=0;i<this.specialItems.length;i++){
				  String value=this.specialItems[i];
				  System.out.println("SpecialItems : "+value+"  at : "+i);
			}
		}
		
		System.out.println("Starting showInfo in Restaurent....");

	}
}