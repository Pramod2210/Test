package contaniment;

public class Engine {
 int speed,rpm,power;

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getRpm() {
	return rpm;
}

public void setRpm(int rpm) {
	this.rpm = rpm;
}

public int getPower() {
	return power;
}

public void setPower(int power) {
	this.power = power;
}
public String toString() {
	 return "Speed : "+speed+"rpm :"+rpm+"power : "+power;
}
}
