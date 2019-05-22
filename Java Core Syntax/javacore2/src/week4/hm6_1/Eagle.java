package week4.hm6_1;

public class Eagle extends FlyingBird {

	private double wingLength;

	public Eagle(String feathers, boolean layEggs, int minutesOfFly, double wingLength) {
		super(feathers, layEggs, minutesOfFly);
		this.wingLength = wingLength;
	}

	
	
	@Override
	void fly() {
		System.out.println("I`m an eagle, my wings length is: " + this.wingLength + " centimeter");

	}

	public double getWingLength() {
		return wingLength;
	}

	public void setWingLength(double wingLength) {
		this.wingLength = wingLength;
	}

}
