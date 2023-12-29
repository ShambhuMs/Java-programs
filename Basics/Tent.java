class Tent{
	int slNo;
	double width;
	double height;
enum Color{
	BLACK,BLUE,GREEN;
	
}	

    Tent(int slNo, double width,double height){
		this.slNo=slNo;
		this.width=width;
		this.height=height;
	}
  
	
 
	boolean open(){
		System.out.println("Running open in tent..");
		return false;
	}
   
	
	
	boolean close(){
		System.out.println("Running close in tent..");	     
		return false;
	}
	
	
	
	
	void showInfo(){
		System.out.println("Tent slno : "+slNo);
		Color color=Color.BLUE;
		System.out.println("tent color : "+color);
		System.out.println("Tent width : "+width);
		System.out.println("Tent height : "+height);
		open();
		close();
		
	}

}