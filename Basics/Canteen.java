class Canteen{

	String type;
	String[] utensils;

	Canteen(String type)
	{
        this.type=type;   
		System.out.println("Created Canteen with  argument constructor");
	}

	void setUtensils(String[] utensils){

		this.utensils=utensils;
	}

	void showInfo(){

		System.out.println("Starting displayInfo in Canteen");
		System.out.println("Canteen type is "+this.type);
		System.out.println("Canteen utensils are "+this.utensils);
		if(this.utensils!=null){
		for(int i=0;i<this.utensils.length;i++){

			String val=this.utensils[i];
			System.out.println("utensils : "+val+" at : "+i);
		}
		}
		System.out.println("Ending displayInfo in Canteen");
	}
}