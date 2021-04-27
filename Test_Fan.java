package tutorials;

public class Test_Fan {

	public static void main(String[] args) {
		/* Name : Sulaiman Ariffin bin Saji
		 * Section : 1
		 * Mat Number : 2014975
		 * Subject : OOP Tutorial
		 */
		System.out.println("Fan.java testing ::");
		
		//create a new fan :: 
		Fan fan1 = new Fan();
		System.out.println("Notice : New fan is created.\n");
		
		// test setter method
		// giving the new fan characteristics ::
		fan1.setColor("purple");
		fan1.setOn(true);
		fan1.setSpeed("FAST");
		
		// test printing using getter method
		System.out.println("The fan speed is " + fan1.getSpeed());
				
		// test printing the fan using toString method
		System.out.println("\nFan Characteristics : ");
		System.out.println(fan1.toString());
		
	
		
		
		

	}

}
