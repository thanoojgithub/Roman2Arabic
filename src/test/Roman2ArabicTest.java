package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Roman2Arabic;
import com.common.ResponseInArabic;
import com.exceptions.NonValidRomanException;

public class Roman2ArabicTest {

	private Roman2Arabic r;

	@Before
	public void setup() {
		r = new Roman2Arabic();

	}

	@Test
	public void convertToArabic_I_1() throws NonValidRomanException {
		ResponseInArabic convertToArabic = r.convertToArabic("I");
		Assert.assertEquals(1, convertToArabic.getArabic());
		Assert.assertNull(convertToArabic.getException());
	}

	@Test
	public void convertToArabic_V_5() throws NonValidRomanException {
		ResponseInArabic convertToArabic = r.convertToArabic("V");
		Assert.assertEquals(5, convertToArabic.getArabic());
		Assert.assertNull(convertToArabic.getException());
	}
	
	@Test(expected=NonValidRomanException.class)
	public void convertToArabic_inVaildRoman_Exception() throws NonValidRomanException {
		ResponseInArabic convertToArabic = r.convertToArabic("INVALID");
		Assert.assertNotNull(convertToArabic.getException());
		
	}

}
