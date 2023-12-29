class ClockEnter{

 public static void main(String[] args){
	 System.out.println("Main start in ClockEnter...");
	 Clock clock=new Clock();
	 System.out.println("clock brand name is:"+clock.brand);
	 System.out.println("clock cost is:"+clock.cost);
	 System.out.println("clock color is:"+clock.color);
   	 System.out.println("clock type is:"+clock.type);
	 System.out.println("clock quantity is:"+clock.quantity);
	 System.out.println("________________________________");
	 
	 Clock clock1=new Clock("Noise");
	 System.out.println("clock1 brand name is:"+clock1.brand);
	 System.out.println("clock1 cost is:"+clock1.cost);
	 System.out.println("clock1 color is:"+clock1.color);
   	 System.out.println("clock1 type is:"+clock1.type);
	 System.out.println("clock1 quantity is:"+clock1.quantity);
	 System.out.println("______________________________________");
	 
	 Clock clock2=new Clock(600);
	 System.out.println("clock2 brand name is:"+clock2.brand);
	 System.out.println("clock2 cost is:"+clock2.cost);
	 System.out.println("clock2 color is:"+clock2.color);
   	 System.out.println("clock2 type is:"+clock2.type);
	 System.out.println("clock2 quantity is:"+clock2.quantity);
	 System.out.println("______________________________________");

     Clock clock3=new Clock("black","digital");
	 System.out.println("clock3 brand name is:"+clock3.brand);
	 System.out.println("clock3 cost is:"+clock3.cost);
	 System.out.println("clock3 color is:"+clock3.color);
   	 System.out.println("clock3 type is:"+clock3.type);
	 System.out.println("clock3 quantity is:"+clock3.quantity);
	 System.out.println("______________________________________");

	 Clock clock4=new Clock(4);
	 System.out.println("clock4 brand name is:"+clock4.brand);
	 System.out.println("clock4 cost is:"+clock4.cost);
	 System.out.println("clock4 color is:"+clock4.color);
   	 System.out.println("clock4 type is:"+clock4.type);
	 System.out.println("clock4 quantity is:"+clock4.quantity);
	 System.out.println("______________________________________");

	 Clock clock5=new Clock("Apple",8000,"White","digital",2);
	 System.out.println("clock5 brand name is:"+clock5.brand);
	 System.out.println("clock5 cost is:"+clock5.cost);
	 System.out.println("clock5 color is:"+clock5.color);
   	 System.out.println("clock5 type is:"+clock5.type);
	 System.out.println("clock5 quantity is:"+clock5.quantity);
	 System.out.println("______________________________________");


	 
	 System.out.println("Main End in ClockEnter...");
	 
 }
}