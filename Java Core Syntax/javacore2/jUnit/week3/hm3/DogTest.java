package week3.hm3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {
	
	Dog dog1 = new Dog("Jack", 26, Breed.AKITA);
	Dog dog2 = new Dog("Jack", 25, Breed.AKITA);
	Dog dog3 = new Dog("Duke", 24, Breed.AKITA);
	Dog dog4 = new Dog("Jack", 24, Breed.AKITA);

	@Test
	public void testCheckIfTheNameEquals() {
		
		boolean condit = dog1.checkIfTheNameEquals(dog2);
		
		assertTrue(condit);
		assertEquals(dog1.getName(), dog2.getName());
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testCheckIfTheNameNotEquals() {
		
		boolean condit = dog2.checkIfTheNameEquals(dog3);
		
		assertFalse(condit);
	}
	

	@Test
	public void testCheckIfThisDogAgeMoreThanCompareDogAge() {
		
		int expected = 1;
		int actual = dog1.checkTheOldestDog(dog2);
		assertEquals(expected, actual);
		
		
		//fail("Not yet implemented");
	}

	@Test
	public void testCheckIfThisDogAgeLessThanCompareDogAge() {
		
		int expected = -1;
		int actual = dog2.checkTheOldestDog(dog1);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCheckIfThisDogAgeEqualsToCompareDogAge() {
		
		int expected = 0;
		int actual = dog3.checkTheOldestDog(dog4);
		assertEquals(expected, actual);
		
	}
	
	
}
