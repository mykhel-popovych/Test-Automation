import calc.DivReadNumber;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivReadNumberTest {
    private DivReadNumber obj;

    @BeforeClass
    public void createObject(){
        obj = new DivReadNumber();
    }


    @Test
    public void DivideTwoNumbers() throws Exception {
        double actualResult = obj.div(50,20);
        double expectedResult = 2;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CheckNumber(){
        String actualResult = obj.readNumberForTest(1,10,5);
        String expectedResult = "Success!";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
