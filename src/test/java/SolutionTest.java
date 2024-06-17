import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int c = 5;
        boolean expected = true;
        boolean actual = new Solution().judgeSquareSum(c);

        Assert.assertEquals(expected, actual);
    }
}
