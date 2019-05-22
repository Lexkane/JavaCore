package week4.hm6_1;

public class Swallow extends FlyingBird {

	private double wingLength;

	public Swallow(String feathers, boolean layEggs, int minutesOfFly, double wingLength) {
		super(feathers, layEggs, minutesOfFly);
		this.wingLength = wingLength;
	}

	@Override
	void fly() {
		System.out.println("I`m a swallow, my wings length is " + this.wingLength);

	}

	public double getWingLength() {
		return wingLength;
	}

	public void setWingLength(double wingLength) {
		this.wingLength = wingLength;
	}

}
