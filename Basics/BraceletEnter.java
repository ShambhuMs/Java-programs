class BraceletEnter{
	
	public static void main(String[] args){
		System.out.println("Main start in braceletEnter...");
		Bracelet bracelet=new Bracelet();
		System.out.println("bracelet name : "+bracelet.name);
		System.out.println("bracelet shape : "+bracelet.shape);
        System.out.println("bracelet cost : "+bracelet.cost);
		System.out.println("bracelet weight : "+bracelet.weight);
		System.out.println("bracelet quantity : "+bracelet.quantity);
		System.out.println("___________________________________");
		
		Bracelet bracelet1=new Bracelet("sush");
		System.out.println("bracelet1 name : "+bracelet1.name);
		System.out.println("bracelet1 shape : "+bracelet1.shape);
        System.out.println("bracelet1 cost : "+bracelet1.cost);
		System.out.println("bracelet1 weight : "+bracelet1.weight);
		System.out.println("bracelet1 quantity : "+bracelet1.quantity);
		System.out.println("___________________________________");
		
		Bracelet bracelet2=new Bracelet("hary",25.2);
		System.out.println("bracelet2 name : "+bracelet2.name);
		System.out.println("bracelet2 shape : "+bracelet2.shape);
        System.out.println("bracelet2 cost : "+bracelet2.cost);
		System.out.println("bracelet2 weight : "+bracelet2.weight);
		System.out.println("bracelet2 quantity : "+bracelet2.quantity);
		System.out.println("___________________________________");
		
		Bracelet bracelet3=new Bracelet("arun",13.3,160,4);
		System.out.println("bracelet3 name : "+bracelet3.name);
		System.out.println("bracelet3 shape : "+bracelet3.shape);
		System.out.println("bracelet3 cost : "+bracelet3.cost);
		System.out.println("bracelet3 weight : "+bracelet3.weight);
		System.out.println("bracelet3 quantity : "+bracelet3.quantity);
		System.out.println("___________________________________");
		
		Bracelet bracelet4=new Bracelet("Manu","square",27.8,90,2);
		System.out.println("bracelet4 name : "+bracelet4.name);
		System.out.println("bracelet4 shape : "+bracelet4.shape);
        System.out.println("bracelet4 cost : "+bracelet4.cost);
		System.out.println("bracelet4 weight : "+bracelet4.weight);
		System.out.println("bracelet4 quantity : "+bracelet4.quantity);
		System.out.println("___________________________________");
		
		
		System.out.println("Main end in BraceletEnter...");
	
	}
}