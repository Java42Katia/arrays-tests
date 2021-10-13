import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTests {

	@Test
	void simpleArrayTests() {
		int ar[] = new int[11];
		ar[10] = 2;
		assertEquals(2, ar[10]);
	}
	@Test
	void swapTests() {
		int ar[] = {-10, 20, 12, 40};
		assertEquals(40, ar[3]);
		assertEquals(12, ar[2]);
		// swap
		int tmp = ar[3];
		ar[3] = ar[2];
		ar[2] = tmp;
		assertEquals(12, ar[3]);
		assertEquals(40, ar[2]);
	}
	
	@Test
	void systemArrayCopy1() {
		int ar[] = new int[5];
		int ar1[] = {1, 2, 3};
		int ar2[] = {4, 5};
		int expected[] = {1, 2, 3, 4, 5};
		// TODO
		System.arraycopy(ar1, 0, ar, 0, ar1.length);
		System.arraycopy(ar2, 0, ar, 3, ar2.length);
		assertArrayEquals(expected, ar);
	}
	
	@Test
	void systemArrayShift() {
		int ar[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar, 1, ar, 0, ar.length - 1);
		ar[ar.length - 1] = 0;
		int expected[] = {2, 3, 4, 5, 0};
		assertArrayEquals(expected, ar);
	}
	
	@Test
	void systemArrayDelete() {
		int ar[] = {1, 2, 3, 4, 5};
		int actual[] = new int[4];
		int expected[] = {1, 2, 4, 5};
		System.arraycopy(expected, 0, actual, 0, 2);
		System.arraycopy(expected, 2, actual, 2, 2);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void systemArrayInsert() {
		int ar[] = {1, 2, 3, 4, 5};
		int actual[] = new int[6];
		int expected[] = {1, 2, 3, -10, 4, 5};
		// TODO make sure the following assert will pass using System.arraycopy
		System.arraycopy(expected, 0, actual, 0, 2);
		System.arraycopy(expected, 4, actual, 4, 2);
		actual[3] = -10;
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void arraysCopyOf() {
		// TODO write tests for Arrays.copyOf functionality according to the doc
	}
	
	@Test
	void arraysCopyOfRange() {
		// TODO write tests for Arrays.copyOfRange functionality according to the doc
	}
	
	@Test
	void arraysBinarySearch() {
		// TODO write tests for Arrays.binarySearch functionality according to the doc
	}

}