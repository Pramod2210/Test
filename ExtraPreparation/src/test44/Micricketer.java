package test44;
//Create a java class Cricketer. Class has int playerid, String name , Boolean isBaller , float 
//strikerate , int runs. All fields are private. Write getter setter for all fields of this class. 
public class Micricketer {

	private int id ,runs;
	private String name;
	private float strikerate;
	private boolean isballer;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setStrikerate (float strikerate) {
		this.strikerate=strikerate;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isIsballer() {
		return isballer;
	}
	public void setIsballer(boolean isballer) {
		this.isballer = isballer;
	}
	public int getRuns() {
		return runs;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "Micricketer [id=" + id + ", runs=" + runs + ", name=" + name + ", strikerate=" + strikerate
				+ ", isballer=" + isballer + "]";
	}
	
	
}
