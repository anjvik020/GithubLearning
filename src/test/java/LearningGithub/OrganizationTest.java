package LearningGithub;
import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups = "SmokeTest")
	public void organizationTest()
	{
		System.out.println("Organization created with mandatory field");
	}
	@Test(groups = "RegressionTest")
	public void organizationTestWithPhoneNoTest()
	{
		System.out.println("Organization created with PhoneNo");
	}
	@Test(groups = "RegressionTest")
	public void organizationTestWithShppingTest()
	{
		System.out.println("Organization created with Shipping");
	
	}
}
