package week4.hm6_1;

public class Penguin extends NonFlyingBird {

	private double timeUnderWater;

	public Penguin(String feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	public Penguin(String feathers, boolean layEggs, double timeUnderWater) {
		super(feathers, layEggs);
		this.timeUnderWater = timeUnderWater;
	}

	@Override
	void fly() {
		System.out.println("I`m a penguin, i can swim under water for " + this.timeUnderWater + " minutes");

	}

	public double getTimeUnderWater() {
		return timeUnderWater;
	}

	public void setTimeUnderWater(double timeUnderWater) {
		this.timeUnderWater = timeUnderWater;
	}
	

}
