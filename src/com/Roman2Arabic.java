package com;

import com.common.Arabic;
import com.common.ResponseInArabic;
import com.common.Roman;
import com.exceptions.NonValidRomanException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Roman2Arabic {

	private final static Logger logger = LoggerFactory.getLogger(Roman2Arabic.class);
	
	public ResponseInArabic convertToArabic(String r) throws NonValidRomanException {
		ResponseInArabic responseInArabic = null;
		NonValidRomanException nonValidRomanException = null;
		int arabicByRoman = getArabicByRoman(r);
		if (arabicByRoman != 0) {
			logger.debug("arabicByRoman != 0.",r);
			responseInArabic = new ResponseInArabic(arabicByRoman, nonValidRomanException);
		} else {
			logger.debug("arabicByRoman == 0.",r);
			nonValidRomanException = new NonValidRomanException("User input is not a Roman");
			responseInArabic = new ResponseInArabic(arabicByRoman, nonValidRomanException);
			throw nonValidRomanException;
		}
		return responseInArabic;
	}

	private int getArabicByRoman(String r) {
		if (r.equals(Roman.I.getValue())) {
			logger.debug("ONE.",r);
			return Arabic.ONE.getValue();
		} else if (r.equals(Roman.V.getValue())) {
			logger.debug("FIVE.",r);
			return Arabic.FIVE.getValue();
		} else {
			logger.debug("INVALID.",r);
			return 0;
		}
	}
}