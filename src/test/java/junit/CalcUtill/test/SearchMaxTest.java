package junit.CalcUtill.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.biz.CalcUtill;

public class SearchMaxTest {
	@Test
	public void testSearchMax() {
		CalcUtill calc = new CalcUtill();
		
		assertEquals("CalcUtill Max", 4, calc.searchMax(new int[] {1, 3, 4, 2}));
		assertEquals("CalcUtill Max", -1, calc.searchMax(new int[] {-12, -1, -3, -4, -2}));
	}
}
