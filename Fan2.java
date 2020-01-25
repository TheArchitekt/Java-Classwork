
public class Fan2 {
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	static int numberOfObjects = 0;
	
	public Fan2(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
		numberOfObjects++;
	}
	
	public Fan2(int speed, boolean on, double radius, String color) {
		
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
		numberOfObjects++;
	}
	
	public int getSpeed() {
		return speed;
	}
	public boolean isOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius (double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toS() {
		if (on)
			return "The status of the fan is as follows: " + "\nFan Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
		
		else
			return "Fan is off" + "\nColor: " + color + "\nRadius: " + radius;
		
	}
}
