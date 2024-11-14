
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNextDate {

    @Test
    public void TestInvalidInputDayZero() {
        NextDate nextDate = new NextDate(1, 0, 2020);
        assertEquals(nextDate.run(1, 0, 2020), "invalid Input Date");
    }
    @Test
    public void TestInvalidInputMonthZero() {
        NextDate nextDate = new NextDate(0, 1, 2020);
        assertEquals(nextDate.run(0, 1, 2020), "invalid Input Date");
    }
    @Test
    public void TestInvalidInputMonthThirteen() {
        NextDate nextDate = new NextDate(13, 1, 2020);
        assertEquals(nextDate.run(13, 1, 2020), "invalid Input Date");
    }

    @Test //new 
    public void TestInvalidInputEarlyYear() {
        NextDate nextDate = new NextDate(1, 0, 1800);
        assertEquals(nextDate.run(1, 0, 1800), "invalid Input Date");
    }

    @Test
    public void TestInvalidInputFutureYear() {
        NextDate nextDate = new NextDate(1, 0, 2022);
        assertEquals(nextDate.run(1, 0, 2022), "invalid Input Date");
    }

    @Test
    public void TestIncrementingDayThirtyOne() {
        NextDate nextDate = new NextDate(1, 30, 2020);
        assertEquals(nextDate.run(1, 30, 2020), "1/31/2020");
    }

    @Test
    public void TestIncrementingMonthThirtyOne() {
        NextDate nextDate = new NextDate(1, 31, 2020);
        assertEquals(nextDate.run(1, 31, 2020), "2/1/2020");
    }


    @Test
    public void TestIncrementingDayThirty() {
        NextDate nextDate = new NextDate(4, 29, 2020);
        assertEquals(nextDate.run(4, 29, 2020), "4/30/2020");
    }


    @Test
    public void TestThirtyIncrementMonth() {
        NextDate nextDate = new NextDate(4, 30, 2020);
        assertEquals(nextDate.run(4, 30, 2020), "5/1/2020");
    }

    @Test
    public void TestThirtyInvalidInput() {
        NextDate nextDate = new NextDate(4, 31, 2020);
        assertEquals(nextDate.run(4, 31, 2020), "Invalid Input Date");
    }

    @Test
    public void TestDecemberIncrementDay() {
        NextDate nextDate = new NextDate(12, 30, 2020);
        assertEquals(nextDate.run(12, 30, 2020), "12/31/2020");
    }

    @Test
    public void TestYearResetMonth() {
        NextDate nextDate = new NextDate(12, 31, 2020);
        assertEquals(nextDate.run(12, 31, 2020), "1/1/2021");
    }

    @Test
    public void TestInvalidNextYear() {
        NextDate nextDate = new NextDate(12, 31, 2021);
        assertEquals(nextDate.run(12, 31, 2021), "Invalid Next Year");
    }

    @Test
    public void TestFebruaryIncrementDayTwentySeven() {
        NextDate nextDate = new NextDate(2, 27, 2020);
        assertEquals(nextDate.run(2, 27, 2020), "2/28/2020");
    }

    @Test
    public void TestFebruaryIncrementDayLeapYear() {
        NextDate nextDate = new NextDate(2, 28, 2020);
        assertEquals(nextDate.run(2, 28, 2020), "2/29/2020");
    }


    @Test
    public void TestFebruaryIncrementDayNonLeapYear() {
        NextDate nextDate = new NextDate(2, 28, 2021);
        assertEquals(nextDate.run(2, 28, 2021), "3/1/2021");
    }

    @Test
    public void TestFebruaryIncrementDayLeapYearMovesToMarch() {
        NextDate nextDate = new NextDate(2, 29, 2020);
        assertEquals(nextDate.run(2, 29, 2020), "3/1/2020");
    }

    @Test
    public void TestFebruaryInvalidInput() {
        NextDate nextDate = new NextDate(2, 30, 2020);
        assertEquals(nextDate.run(2, 30, 2020), "Invalid Input Date");
    }

    @Test
    public void TestFebruaryLeapYearMillenium() {
        NextDate nextDate = new NextDate(2, 29, 2000);
        assertEquals(nextDate.run(2, 29, 2000), "3/1/2000");
    }


    }

