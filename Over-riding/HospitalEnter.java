class HospitalEnter{
	
	public static void main(String... val){
		System.out.println("...Main start in HospitalEnter...");
		
		Hospital h=new Hospital();
		h.treatement("btm");
		h.treatement("hsr","Ananda");
		h.open();
		h.close();
		h.security();
		h.patient();
		h.setType();
		h.setRating();
		h.setNoOfbed();
		h.ambulance();
		h.setNoOfWorker();
		h.setNoOfDoctor();
		
		System.out.println("=============================================");

		Clinic c= new Clinic("JP Nagar","Jaydev",HospitalType.EYE,20,4,"Govt",4.5,true,6,13,"Arun clinic","Arun");
		
		System.out.println("=============================================");
		
		Clinic clinic=new Clinic();
		clinic.treatement("Bannerghatta","Vikram clinic");
		clinic.open();
		clinic.close();
		clinic.clinicOpen();
		clinic.clinicClose();
		clinic.treat();
		clinic.setDoc();
		clinic.patient();
		
		System.out.println("...Main end in HospitalEnter...");
	}
}