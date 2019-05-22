package week4.hm6_1;

public class Chicken extends NonFlyingBird {

	private int avarageQuantityEggsPerMonth;

	public Chicken(String feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	public Chicken(String feathers, boolean layEggs, int eggsPerMonth) {
		super(feathers, layEggs);
		this.avarageQuantityEggsPerMonth = eggsPerMonth;
	}

	@Override
	void fly() {
		System.out.println("I`m a chicken, i can lay " + this.avarageQuantityEggsPerMonth + " eggs per month.");

	}

	public int getAvarageQuantityEggsPerMonth() {
		return avarageQuantityEggsPerMonth;
	}

	public void setAvarageQuantityEggsPerMonth(int avarageQuantityEggsPerMonth) {
		this.avarageQuantityEggsPerMonth = avarageQuantityEggsPerMonth;
	}

}
