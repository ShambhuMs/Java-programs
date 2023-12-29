class ClinicEnter{
     public static void main(String[] args){
		System.out.println("Main start in ClinicEnter...."); 
		 Docter docter=new Docter();
		 Clinic clinic=new Clinic("Skin ",10,5,docter);
		 docter.name="Kiran";
		 docter.exp=10;
		 docter.fake=false;
		 docter.fees=400;
		 clinic.showInfo();
		 
		 System.out.println("Main ends in ClinicEnter...");
	 }
}