class Frequency{
	
	public static void main(String[] args){
		int array[]={2,3,2,6,3,5};
		int[] value= new int[array.length];
		
		for(int i=0;i<array.length;i++){
			int count=1;
		  for(int j=i+1;j<array.length;j++){
			if(array[i]==array[j]){
				count++;
			}
			
		  }
		  if(value[i]==0){
			  value[i]=count;
		  }
		}
		 for(int i=0;i<array.length;i++){
			if(value[i]>0){
			System.out.println("no is: "+array[i]+"value is : " +value[i]);
		  	 
		 } 
		
		 }
	}
}