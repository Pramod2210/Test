package Interface;

public class MobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NormailMobile m=new NormailMobile();
        m.battery();
        m.calculator();
        m.calender();
        m.calling();
        m.clock();
        m.display();
        m.fm();
        m.message();
        m.ram();
        System.out.println();
        System.out.println("-----****Smartphone****----- ");
        
        SmartPhone s=new SmartPhone();
        System.out.println();
        s.battery();
        s.calculator();
        s.calender();
        s.calling();
        s.clock();
       s.display();
       s.fm();
       s.message();
       s.ram();
	}

}
