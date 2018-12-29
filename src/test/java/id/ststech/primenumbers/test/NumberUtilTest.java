package id.ststech.primenumbers.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import id.ststech.primenumbers.NumberUtil;

public class NumberUtilTest {

	@Test
	public void testIsPrime() {
	
		Assertions.assertEquals(false, NumberUtil.isPrime(0));
		Assertions.assertEquals(false, NumberUtil.isPrime(1));
		Assertions.assertEquals(true, NumberUtil.isPrime(2));
		Assertions.assertEquals(true, NumberUtil.isPrime(3));
		Assertions.assertEquals(false, NumberUtil.isPrime(4));
		Assertions.assertEquals(true, NumberUtil.isPrime(5));
		Assertions.assertEquals(false, NumberUtil.isPrime(6));
		Assertions.assertEquals(true, NumberUtil.isPrime(7));
		Assertions.assertEquals(false, NumberUtil.isPrime(8));
		Assertions.assertEquals(false, NumberUtil.isPrime(9));
		Assertions.assertEquals(false, NumberUtil.isPrime(10));
		Assertions.assertEquals(true, NumberUtil.isPrime(11));
		Assertions.assertEquals(false, NumberUtil.isPrime(12));
		Assertions.assertEquals(true, NumberUtil.isPrime(13));
		Assertions.assertEquals(false, NumberUtil.isPrime(14));
		Assertions.assertEquals(false, NumberUtil.isPrime(15));
		Assertions.assertEquals(false, NumberUtil.isPrime(16));
		Assertions.assertEquals(true, NumberUtil.isPrime(17));
		Assertions.assertEquals(false, NumberUtil.isPrime(18));
		Assertions.assertEquals(true, NumberUtil.isPrime(19));
		Assertions.assertEquals(false, NumberUtil.isPrime(20));
		Assertions.assertEquals(false, NumberUtil.isPrime(21));
		Assertions.assertEquals(false, NumberUtil.isPrime(22));
		Assertions.assertEquals(true, NumberUtil.isPrime(23));
		Assertions.assertEquals(false, NumberUtil.isPrime(24));
		Assertions.assertEquals(false, NumberUtil.isPrime(25));
		Assertions.assertEquals(false, NumberUtil.isPrime(26));
		Assertions.assertEquals(false, NumberUtil.isPrime(27));
		Assertions.assertEquals(false, NumberUtil.isPrime(28));
		Assertions.assertEquals(true, NumberUtil.isPrime(29));
		Assertions.assertEquals(false, NumberUtil.isPrime(30));
		Assertions.assertEquals(true, NumberUtil.isPrime(31));
	}
	
	@Test
	public void testFibonacci() {
		
		// Put your test code here
		
		Assertions.assertEquals(0, NumberUtil.fibonnaci(0));
		Assertions.assertEquals(1, NumberUtil.fibonnaci(1));
		Assertions.assertEquals(1, NumberUtil.fibonnaci(2));
		Assertions.assertEquals(2, NumberUtil.fibonnaci(3));
		Assertions.assertEquals(3, NumberUtil.fibonnaci(4));
		Assertions.assertEquals(5, NumberUtil.fibonnaci(5));
		Assertions.assertEquals(8, NumberUtil.fibonnaci(6));
		Assertions.assertEquals(13, NumberUtil.fibonnaci(7));
		Assertions.assertEquals(21, NumberUtil.fibonnaci(8));
		Assertions.assertEquals(34, NumberUtil.fibonnaci(9));
		Assertions.assertEquals(55, NumberUtil.fibonnaci(10));
		Assertions.assertEquals(89, NumberUtil.fibonnaci(11));
		Assertions.assertEquals(144, NumberUtil.fibonnaci(12));
		
	}
}
