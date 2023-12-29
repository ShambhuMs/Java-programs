class WalletEnter{
	
	public static void main(String[] args){
		System.out.println("Main start in WalletEnter....");
		Wallet wallet=new Wallet();
		System.out.println("wallet brand: "+wallet.brand);
		System.out.println("wallet quantity: "+wallet.quantity);
		System.out.println("wallet type: "+wallet.type);
		System.out.println("wallet cost: "+wallet.cost);
		System.out.println("________________________________");
		
		Wallet wallet1=new Wallet("skype");
		System.out.println("wallet1 brand: "+wallet1.brand);
		System.out.println("wallet1 quantity: "+wallet1.quantity);
		System.out.println("wallet1 type: "+wallet1.type);
		System.out.println("wallet1 cost: "+wallet1.cost);
		System.out.println("________________________________");
		
		Wallet wallet2=new Wallet(2);
		System.out.println("wallet2 brand: "+wallet2.brand);
		System.out.println("wallet2 quantity: "+wallet2.quantity);
		System.out.println("wallet2 type: "+wallet2.type);
		System.out.println("wallet2 cost: "+wallet2.cost);
		System.out.println("________________________________");
		
		Wallet wallet3=new Wallet("sports","Lether");
		System.out.println("wallet3 brand: "+wallet3.brand);
		System.out.println("wallet3 quantity: "+wallet3.quantity);
		System.out.println("wallet3 type: "+wallet3.type);
		System.out.println("wallet3 cost: "+wallet3.cost);
		System.out.println("________________________________");
		
		Wallet wallet4=new Wallet(500);
		System.out.println("wallet4 brand: "+wallet4.brand);
		System.out.println("wallet4 quantity: "+wallet4.quantity);
		System.out.println("wallet4 type: "+wallet4.type);
		System.out.println("wallet4 cost: "+wallet4.cost);
		System.out.println("________________________________");
		
		Wallet wallet5=new Wallet("super",2,"normal",250);
		System.out.println("wallet5 brand: "+wallet5.brand);
		System.out.println("wallet5 quantity: "+wallet5.quantity);
		System.out.println("wallet5 type: "+wallet5.type);
		System.out.println("wallet5 cost: "+wallet5.cost);
		System.out.println("________________________________");
		
		System.out.println("Main end in WalletEnter....");
	}
}