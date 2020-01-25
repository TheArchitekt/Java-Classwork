
public class TestFan2 {
	public static void main(String[] args) {
		Fan2 fan1 = new Fan2();
		
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		Fan2 fan2 = new Fan2();
		
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setOn(true);
		
		System.out.println(fan1.toS());
		System.out.println(fan2.toS());
		
		fan1.setOn(false);
		System.out.println(fan1.toS());
		
		System.out.println("The number of objects is: " + Fan2.getNumberOfObjects());
		
	} 

}
