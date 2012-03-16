package de.unisb.cs.st.evosuite.junit;

import org.junit.BeforeClass;
import org.junit.Test;

public class InheritanceExample extends TestExample {

	protected static Integer otherValue = 10;

	static {
		initializeAgain();
	}

	@BeforeClass
	public static void meanWhile() {
		otherValue = doCalc(value, otherValue);
	}

	public InheritanceExample() {
		doOtherCalc(value);
	}

	@Test
	public void testInheritance() {
		super.setupNeeded();
		MockingBird bird = new MockingBird(needed + "me");
		bird.executeCmd(value - otherValue);
	}
}
