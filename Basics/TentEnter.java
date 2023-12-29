class TentEnter{
	
	public static void main(String[] args){
		System.out.println("main start in TentEnter..");
		Tent tent=new Tent(123,45.4,32.3);
		tent.showInfo();
		System.out.println("============================");
		Agent agent=new Agent();
		agent.openTent(3452,"Nitin","Burnas",tent);
	    agent.showInfo();
		System.out.println("============================");
		agent.closeTent(3456,"shambhu","Dandeli Resort",tent);
		agent.showInfo();
		System.out.println("============================");
		
		
		
		System.out.println("main end in TentEnter..");
	}
}