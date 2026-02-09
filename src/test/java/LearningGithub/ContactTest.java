package LearningGithub;
import org.testng.annotations.Test;

public class ContactTest  {
	@Test(groups = "SmokeTest")
public void contactTest()
{
	System.out.println("Contact created with mandatory field");
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}
	@Test(groups = "RegressionTest")
public void contactTestWithPhoneTest()
{
	System.out.println("Contact created with phone no");
}
	@Test(groups = "RegressionTest")
public void contactTestWithShippingTest()
{
	System.out.println("Contact created with shipping ");
}
}
