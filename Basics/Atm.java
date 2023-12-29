class Atm{
	
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctvBrands;
	
	Atm(){
		
		System.out.println("created Atm with no argument");
	}
	
	void setBranch(String[] branch){
		this.branch=branch;
	}
	
	void setAcs(String[] acs){
		this.acs=acs;
	}
	
	void setCctvBrands(String[] cctvBrands){
		this.cctvBrands=cctvBrands;
	}
	
	void showInfo(){
		
		System.out.println("Starting showInfo in Atm");
		System.out.println("Bank name is : "+this.bankName);
		
		System.out.println("Bank branch : "+this.branch);
		if(this.branch!=null){
		for(int i=0;i<this.branch.length;i++){
			
			String ref=this.branch[i];
			System.out.println("Bank branch : "+this.branch[i]+" at : "+i);
		}
		}
		
		System.out.println("Bank acs : "+this.acs);
		if(this.acs!=null){
		for(int i=0;i<this.acs.length;i++){
			
			String ref=this.acs[i];
			System.out.println("Atm acs : "+this.acs[i]+" at : "+i);
		}
		}
		
		System.out.println("Bank cctvBrands : "+this.cctvBrands);
		if(this.cctvBrands!=null){
		for(int i=0;i<this.cctvBrands.length;i++){
			
			String ref=this.cctvBrands[i];
			System.out.println("Atm cctvBrands : "+this.cctvBrands[i]+" at : "+i);
		}
		}
		
		System.out.println("Ending showInfo in Atm");
	}
}