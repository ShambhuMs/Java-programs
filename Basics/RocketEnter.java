class RocketEnter{
	
	public static void main(String[] args){
		System.out.println("Main start in RocketEnter...");
		Rocket rocket=new Rocket();
		System.out.println("rocket name : "+rocket.name);
        System.out.println("rocket cost : "+rocket.cost);
		System.out.println("rocket metal : "+rocket.metal);
		System.out.println("rocket quantity : "+rocket.quantity);
		System.out.println("___________________________________");
		
		Rocket rocket1=new Rocket("Ind78945");
		System.out.println("rocket1 name : "+rocket1.name);
        System.out.println("rocket1 cost : "+rocket1.cost);
		System.out.println("rocket1 metal : "+rocket1.metal);
		System.out.println("rocket1 quantity : "+rocket1.quantity);
		System.out.println("___________________________________");
		
		Rocket rocket2=new Rocket(1);
		System.out.println("rocket2 name : "+rocket2.name);
        System.out.println("rocket2 cost : "+rocket2.cost);
		System.out.println("rocket2 metal : "+rocket2.metal);
		System.out.println("rocket2 quantity : "+rocket2.quantity);
		System.out.println("___________________________________");
		
		Rocket rocket3=new Rocket("HSA4526",112465);
		System.out.println("rocket3 name : "+rocket3.name);
        System.out.println("rocket3 cost : "+rocket3.cost);
		System.out.println("rocket3 metal : "+rocket3.metal);
		System.out.println("rocket3 quantity : "+rocket3.quantity);
		System.out.println("___________________________________");
		
		Rocket rocket4=new Rocket("Aus25648","Iron");
		System.out.println("rocket4 name : "+rocket4.name);
        System.out.println("rocket4 cost : "+rocket4.cost);
		System.out.println("rocket4 metal : "+rocket4.metal);
		System.out.println("rocket4 quantity : "+rocket4.quantity);
		System.out.println("___________________________________");
		
		Rocket rocket5=new Rocket("RSE45620",1265498.00,"Aluminium",2);
		System.out.println("rocket5 name : "+rocket5.name);
        System.out.println("rocket5 cost : "+rocket5.cost);
		System.out.println("rocket5 metal : "+rocket5.metal);
		System.out.println("rocket5 quantity : "+rocket5.quantity);
		System.out.println("___________________________________");
		System.out.println("Main start in RocketEnter...");
	
	}
}