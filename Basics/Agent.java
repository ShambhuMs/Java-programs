class Agent{
	int id;
	String name;
	String company;
	Tent tent;
	
	void openTent(int id,String name,String company,Tent tent){
		
		this.tent=tent;
		this.id=id;
		this.name=name;
		this.company=company;
		
	}
	
	void closeTent(int id,String name,String company,Tent tent){
	
		this.tent=tent;
		this.id=id;
		this.name=name;
		this.company=company;
		
	}
	
	
	
	void showInfo(){
		System.out.println("Agent id : "+this.id);
		System.out.println("Agent name : "+this.name);
		System.out.println("Agent company : "+this.company);
		System.out.println("tent  :"+this.tent);
		if(tent!=null){
			System.out.println("Tent slNo : "+this.tent.slNo);
			System.out.println("Tent width : "+this.tent.width);
			System.out.println("Tent height : "+this.tent.height);
		
		}
	}
}