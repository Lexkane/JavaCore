package week4.hm6_1;

public abstract class Bird {

	private String feathers;

	public String getFeathers() {
		return feathers;
	}

	public Bird(String feathers, boolean layEggs) {

		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	private boolean layEggs;

	abstract void fly();

}
