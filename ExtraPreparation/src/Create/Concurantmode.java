package Create;

import java.util.concurrent.ConcurrentHashMap;

public class Concurantmode extends Thread {
	
	Concurantmode(){
		ConcurrentHashMap<String ,Integer>hm=new ConcurrentHashMap<>();
		hm.put("S", 10);
		hm.put("h", 10);
		hm.put("p", 20);
		hm.put("t", 10);
		
	}
	
	public void run (ConcurrentHashMap<String ,Integer>hm) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concurantmode c=new Concurantmode();
		ConcurrentHashMap<String ,Integer>hm=new ConcurrentHashMap<>();
	  Thread t1= new Concurantmode();
	  t1.start();
	 c.run(hm);
	}

}
