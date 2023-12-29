class RestaurentEnter{
	
	public static void main(String[] args){
		System.out.println("Main is start in RestaurentEnter...");
           String[] value=new String[5];
			value[0]="Idli";
			value[1]="Dosa";
			value[2]="Parota";
			value[3]="Poori";
			value[4]="Chapati";
			Restaurent res=new Restaurent("Nitin",value);
	
			res.showInfo();
		
		System.out.println("Main is end in RestaurentEnter...");
	}
}