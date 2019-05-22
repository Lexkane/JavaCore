package week4.hm6_1;

public abstract class FlyingBird extends Bird {

	private int minutesOfFly;

	public FlyingBird(String feathers, boolean layEggs, int minutesOfFly) {
		super(feathers, layEggs);
		this.minutesOfFly = minutesOfFly;
	}

	public int getMinutesOfFly() {
		return minutesOfFly;
	}

	public void setMinutesOfFly(int minutesOfFly) {
		this.minutesOfFly = minutesOfFly;
	}

}
