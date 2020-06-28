import org.junit.*;
import static org.junit.Assert.*;

import date.Date;
import date.util.Month;

public class DateTest{

	@Test
	public void testTomorrowWhenDayLowerThatDayTotalMonth(){
		Date date = new Date(12,Month.january,2019);
		Date dateSuivante = new Date(13,Month.january,2019);
		assertEquals(dateSuivante,date.tomorrow());

	}
	
	@Test
	public void testTomorrowWhenMonthEqualsDecember(){
		Date date =  new Date(31,Month.december,2019);
		Date dateSuivante = new Date(1,Month.january,2020);
		assertEquals(dateSuivante,date.tomorrow());
	}
	
	@Test
	public void testTomorrowWhenYearNotLeapAndEndOfTheMonth(){
		 Date date =  new Date(28,Month.february,2019);
                 Date dateSuivante = new Date(1,Month.march,2019);
                 assertEquals(dateSuivante,date.tomorrow());
	}
	
	@Test
        public void testTomorrowWhenYearLeapAndEndOfTheMonth(){
                 Date date =  new Date(29,Month.february,2020);
                 Date dateSuivante = new Date(1,Month.march,2020);
                 assertEquals(dateSuivante,date.tomorrow());
        }

	@Test
	public void testNdaysLaterNotExcpt(){
                 Date date =  new Date(29,Month.february,2020);
                 Date dateSuivante = new Date(10,Month.march,2020);
                 assertEquals(dateSuivante,date.nDaysLater(10));
	}

	@Test(expected=IllegalArgumentException.class)
        public void testNdaysLaterExcpt() throws Exception {
                 Date date =  new Date(29,Month.february,2020);
                 date.nDaysLater(-1);
                 
        }

	@Test
	public void testDifferenceInDaysWhenNbDaysNegative() {
		Date date = new Date(10,Month.june,2019);
		Date date2 = new Date(25,Month.june,2019);
		assertSame(-15,date.differenceInDays(date2));

	}

	@Test
        public void testDifferenceInDaysWhenNbDaysPositive() {
                Date date = new Date(25,Month.june,2019);
                Date date2 = new Date(10,Month.june,2019);
                assertSame(15,date.differenceInDays(date2));

        }
	
	@Test
	public void testIsBeforewhenTrue() {
                Date date = new Date(24,Month.june,2019);
		Date date2 = new Date(25,Month.june,2019);
		assertTrue(date.isBefore(date2));

	}

 	@Test
        public void testIsBeforewhenFalse() {
                Date date = new Date(25,Month.june,2019);
                Date date2 = new Date(24,Month.june,2019);
                assertFalse(date.isBefore(date2));

        } 

 	@Test
        public void testIsAfterwhenTrue() {
                Date date = new Date(25,Month.june,2019);
                Date date2 = new Date(24,Month.june,2019);
                assertTrue(date.isAfter(date2));

        } 

 	@Test
        public void testIsAfterwhenFalse() {
                Date date = new Date(24,Month.june,2019);
                Date date2 = new Date(25,Month.june,2019);
                assertFalse(date.isAfter(date2));

        }






 public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DateTest.class);
    }

}

