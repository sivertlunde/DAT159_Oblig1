package dat159.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ExtractVariable {

	String platform;
	String browser;
	boolean wasInitialized;
	int resize = 0;
	//Test for push
	void simple() {
		if ( (platform.toUpperCase().indexOf("MAC") > -1) &&
			     (browser.toUpperCase().indexOf("IE") > -1) &&
			      wasInitialized && resize > 0 )
			{
			  // do something
			}
	}
	
	int plusOne() {
		resize = resize+1;
		return resize;
	}
	
	int dangerWillRobinson() {
		// Extract subexpression/"Replace All" in Eclipse
		// (Goodie below)
		int temp = plusOne()+plusOne();
		return temp;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test1() {
		assertEquals(3, dangerWillRobinson());
	}
}
