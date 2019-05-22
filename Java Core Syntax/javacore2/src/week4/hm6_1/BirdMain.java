package week4.hm6_1;

public class BirdMain {

	public static void main(String[] args) {
		
		Bird bird1 = new Eagle("brown", true, 30, 60);
		Bird bird2 = new Swallow("black", true, 15, 8);
		Bird bird3 = new Penguin("black", true, 15.0);
		Bird bird4 = new Chicken("brown", true, 15);
		
		Bird [] birds = new Bird [4];
		birds[0] = bird1;
		birds[1] = bird2;
		birds[2] = bird3;
		birds[3] = bird4;
		
		for (Bird bird : birds) {
			bird.fly();
		}
		
	}
	
}
