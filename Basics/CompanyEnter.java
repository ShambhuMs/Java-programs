class CompanyEnter{
	public static void main(String[] args){
		Job job=new Job();
		Company company=new Company("isteer","AXA123412","BTM",job);
		company.showInfo();
	}
}