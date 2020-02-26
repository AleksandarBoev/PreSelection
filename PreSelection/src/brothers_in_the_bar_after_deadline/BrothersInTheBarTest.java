package brothers_in_the_bar_after_deadline;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrothersInTheBarTest {
    BrothersInTheBar brothersInTheBar;

    @Before
    public void init() {
        brothersInTheBar = new BrothersInTheBar();
    }

    @Test
    public void exampleCase01() {
        int[] glasses = new int[]{1, 1, 2, 3, 3, 3, 2, 2, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(3, actualResult);
    }

    @Test
    public void exampleCase02() {
        int[] glasses = new int[]{1, 1, 2, 1, 2, 2, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void whenEmptyArray_shouldReturnZero() {
        int[] glasses = new int[]{};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void whenSingleElementArray_shouldReturnZero() {
        int[] glasses = new int[]{1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void whenTwoElementArray_shouldReturnZero() {
        int[] glasses = new int[]{1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(0, actualResult);
    }

    @Test
    public void whenThreeSameElements_shouldReturnOne() {
        int[] glasses = new int[]{1, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void whenFourSameElements_shouldReturnOne() {
        int[] glasses = new int[]{1, 1, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void whenFiveSameElements_shouldReturnOne() {
        int[] glasses = new int[]{1, 1, 1, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void whenSixSameElements_shouldReturnTwo() {
        int[] glasses = new int[]{1, 1, 1, 1, 1, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(2, actualResult);
    }

    @Test
    public void whenTwoSetsOfSameElements_shouldReturnTwo() {
        int[] glasses = new int[]{1, 1, 1, 2, 2, 2};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(2, actualResult);
    }

    @Test
    public void whenOneSetCreatesOtherSets_shouldReturnFive() {
        int[] glasses = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 4, 3, 2, 1};

        int actualResult = brothersInTheBar.brothersInTheBar(glasses);

        Assert.assertEquals(5, actualResult);
    }
}