package fr.diginamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTests {

	@Test
	public void StringUtilsTestNormal() {
		int actualResult = StringUtils.levenshteinDistance("cat", "concatenate");
		assertEquals(8, actualResult);
	}
	
	@Test
	public void StringUtilsTestEmpty() {
		int actualResult = StringUtils.levenshteinDistance("", "cat");
		assertEquals(3, actualResult);
	}
	
	@Test
	public void StringUtilsTestNumber() {
		int actualResult = StringUtils.levenshteinDistance("c!at5","cat");
		assertEquals(2, actualResult);
	}
	
	@Test
	public void StringUtilsTestSpecialChar() {
		int actualResult = StringUtils.levenshteinDistance("\u00a0"," ");
		assertEquals(1, actualResult);
	}
	
	@Test
	public void StringUtilsTestNull() {
		int actualResult = StringUtils.levenshteinDistance(null,null);
		assertEquals(0, actualResult);
	}
	
}
