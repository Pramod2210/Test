package EnomDemo;

public enum Ticket {
   silver(150)
   {
	   public String toString() {
		return "silver categiry rate is 150-/";
		   
	   }
   },
   gold(200)
   {
	   public String toString() {
		return "gold categiry rate is 200-/";
		   
	   }
   },
   paltenium(250)
   {
	   public String toString() {
		return "Platinum categiry rate is 250-/";
		   
	   }
   };
	int rate;
	private Ticket(int rate){
		this.rate=rate;
	}
}
