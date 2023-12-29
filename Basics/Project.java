class Project{
	
	Project(){
		System.out.println("Running no-arg cons in Project..");
	}
	
	void validate(Person person){
		if(person!=null){
			person.eat();
			person.sleep();
		   
		   if(person instanceof Developer){
			   Developer developer=(Developer)person;
			   developer.eat();
			   developer.sleep();
			   developer.code();
		   }
			if(person instanceof Tester){
				   Tester tester=(Tester)person;
				   tester.qualityCheck();
				   tester.code();
			}
			   
			if(person instanceof DatabaseDeveloper){
				   DatabaseDeveloper databasedeveloper=(DatabaseDeveloper)person;
				   databasedeveloper.runScripts();
				   databasedeveloper.code();
			}
		   
		   
		   if(person instanceof BusinessAnalyst){
			   BusinessAnalyst businessAnalyst=(BusinessAnalyst)person;
			   businessAnalyst.eat();
			   businessAnalyst.sleep();
			   businessAnalyst.qualityRequirement();
		   }
		
		   if(person instanceof ProductOwner){
			   ProductOwner productOwner=(ProductOwner)person;
			   productOwner.eat();
			   productOwner.sleep();
			   productOwner.validate();
		   }
		   
		   if(person instanceof Devops){
			   Devops devops=(Devops)person;
			   devops.eat();
			   devops.sleep();
			   devops.runBuild();
		   }
		}
	}
}