class PersonEnter{
	
	public static void main(String... args){
		System.out.println("Main start in PersonEnter");
		
		Person person=new Person();
		
		Project project=new Project();
		project.validate(person);
		System.out.println("================");
		
		ProductOwner pro=new ProductOwner();
		project.validate(pro); 
		System.out.println("================");
		
		Developer dev=new Developer();
		project.validate(dev); 
		System.out.println("================");
		
		Tester test=new Tester();
		project.validate(test);
		System.out.println("================");
		
		Devops devops=new Devops();
		project.validate(devops);
		System.out.println("================");
		
		DatabaseDeveloper db=new DatabaseDeveloper();
		project.validate(db);
		System.out.println("================");
		
		BusinessAnalyst bs=new BusinessAnalyst();
		project.validate(bs);
		System.out.println("================");
		
		
		System.out.println("Main End in PersonEnter");
	}
}