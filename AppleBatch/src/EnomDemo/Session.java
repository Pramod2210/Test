package EnomDemo;

public enum Session implements SeasionDetails {
	
  rainy
  {
	
	@Override
	public void Discription() {
		System.out.println("rainy is awsome");
		// TODO Auto-generated method stub
		
	}
  },
  winter
  {
		
		@Override
		public void Discription() {
		
			System.out.println("winter is awossm");
		}
			 
		 },
		 summar
		 {
			public void Description() {
				 System.out.println("summer is awossm");
			 }

		
			public void Discription() {
				
				 System.out.println("summer is awossm");
				
			}
				 
			 };
	
	
	


}
