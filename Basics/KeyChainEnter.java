class KeyChainEnter{
	
	public static void main(String[] args){
		System.out.println("Main start in KeyChainEnter...");
		KeyChain keyChain=new KeyChain();
		System.out.println("keyChain color : "+keyChain.color);
		System.out.println("keyChain shape : "+keyChain.shape);
        System.out.println("keyChain cost : "+keyChain.cost);
		System.out.println("keyChain weight : "+keyChain.weight);
		System.out.println("keyChain quantity : "+keyChain.quantity);
		System.out.println("___________________________________");
		
		KeyChain keyChain1=new KeyChain("red");
		System.out.println("keyChain1 color : "+keyChain1.color);
		System.out.println("keyChain1 shape : "+keyChain1.shape);
        System.out.println("keyChain1 cost : "+keyChain1.cost);
		System.out.println("keyChain1 weight : "+keyChain1.weight);
		System.out.println("keyChain1 quantity : "+keyChain1.quantity);
		System.out.println("___________________________________");
		
		KeyChain keyChain2=new KeyChain("pink",25.2);
		System.out.println("keyChain2 color : "+keyChain2.color);
		System.out.println("keyChain2 shape : "+keyChain2.shape);
        System.out.println("keyChain2 cost : "+keyChain2.cost);
		System.out.println("keyChain2 weight : "+keyChain2.weight);
		System.out.println("keyChain2 quantity : "+keyChain2.quantity);
		System.out.println("___________________________________");
		
		KeyChain keyChain3=new KeyChain("yellow",13.3,120,4);
		System.out.println("keyChain3 color : "+keyChain3.color);
		System.out.println("keyChain3 shape : "+keyChain3.shape);
		System.out.println("keyChain3 cost : "+keyChain3.cost);
		System.out.println("keyChain3 weight : "+keyChain3.weight);
		System.out.println("keyChain3 quantity : "+keyChain3.quantity);
		System.out.println("___________________________________");
		
		KeyChain keyChain4=new KeyChain("blue","halfcircle",27.8,70,3);
		System.out.println("keyChain4 color : "+keyChain4.color);
		System.out.println("keyChain4 shape : "+keyChain4.shape);
        System.out.println("keyChain4 cost : "+keyChain4.cost);
		System.out.println("keyChain4 weight : "+keyChain4.weight);
		System.out.println("keyChain4 quantity : "+keyChain4.quantity);
		System.out.println("___________________________________");
		
		
		System.out.println("Main end in KeyChainEnter...");
	
	}
}