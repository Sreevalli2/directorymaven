import org.testng.annotations.Test;

public class testng2 {
	
	@Test
	public void validatetitle() {
		String expected_title="Yahoo.com";
		String actual_title="Gmail.com";
		if(expected_title.equals(actual_title))
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
