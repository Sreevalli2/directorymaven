import org.testng.Assert;
import org.testng.annotations.Test;

public class testng2 {
	
	@Test
	public void validatetitle() {
		String expected_title="Yahoo.com";
		String actual_title="Gmail.com";
		/*if(expected_title.equals(actual_title))
			System.out.println("pass");
		else
			System.out.println("fail");*/
		//isElementPresent(xpath) true/false
		//Assert.assertEquals(actual_title, expected_title);//it gives the report FAILED: validatetitle
		//Assert.assertTrue(false,"element not found");//.AssertionError: element not found expected [true] but found [false]
       // Assert.assertTrue(true, actual_title);
		Assert.fail("in this test case elements are equal");
	}

}
