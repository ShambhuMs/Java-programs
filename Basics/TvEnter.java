class TvEnter{
	
	public static void main(String[] args){
		System.out.println("main start in TvEnter....");
		
		Speaker speaker=new Speaker(100);
		Tv tv=new Tv(speaker);
		tv.showInfo();
		
		
		System.out.println("main end in TvEnter....");
	}
}