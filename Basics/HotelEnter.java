class HotelEnter{
	
	public static void main(String[] args){
		System.out.println("main start in HotelEnter....");
		
		MenuCard menuCard=new MenuCard();
		menuCard.setMenuCard(10,1000);
		Hotel hotel=new Hotel("Swadisht","Pradeep",menuCard);
		hotel.showInfo();
		
		
		System.out.println("main end in HotelEnter....");
	}
}