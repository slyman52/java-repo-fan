package tutorials;
/* Name : Sulaiman Ariffin bin Saji
 * Section : 1
 * Mat Number : 2014975
 * Subject : OOP Tutorial
 */
public class Fan {
	// declaring constants
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	//declaring variables
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	// no argument constructor ::
	Fan(){
		
	}
	
	// Setter  ::
	
	void setSpeed (String speed) {
		switch (speed) {
		case "SLOW" : this.speed = SLOW; break;
		case "MEDIUM" : this.speed = MEDIUM; break;
		case "FAST" : this.speed = FAST; break;
		default : this.speed = SLOW;
		}
	}
	
	void setOn (boolean on) {
		this.on = on;
	}
	
	void setRadius (double radius) {
		this.radius = radius;
	}
	
	void setColor (String color) {
		this.color = color;
	}
	
	// Getter ::
	
	String getSpeed () {
		if (this.speed == 1) {
			return "SLOW";
		}
		else if (this.speed == 2) {
			return "MEDIUM";
		}
		else {
			return "FAST";
		}
	}
	
	boolean getOn () {
		return this.on;
	}
	
	double getRadius () {
		return this.radius;
	}
	
	String getColor () {
		return this.color;
	}
	
	// toString method
	
	public String toString() {
		
		if(this.on == true) {
			return 	"Speed : " + getSpeed() +
					"\nColor : " + this.color +
					"\nRadius : " + this.radius;
		}
		
		else {
			return "Color : " + this.color +
					"\nRadius : " + this.radius +
					"\nFan is off!";
		}
		
	}
}


