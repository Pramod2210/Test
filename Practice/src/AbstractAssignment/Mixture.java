package AbstractAssignment;

/*2. Above we created an abstract class Machine with an abstract method crush
and a concrete / implemented method rotate. Now create another abstract
class Mixer which extends the abstract class Machine, has method crush
implemented and has an additional concrete method blend. In main create an
object of class of Mixer. Call methods rotate, blend and crush*/



public abstract class Mixture extends Machine {
	void crush() {
		System.out.println("i am crusher");
	}
	
	void blend() {
		System.out.println("blend");
	}

}
