

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CopyOfSecondTestGreationGroup extends BaseTestClass {
 
  
  @Test
  public void testRorPractic2() throws Exception {
	  openMainPage();
	  openGroupPage();
	  createNewGroup();
	  DataForTest params = new DataForTest();
	  params.groupname = "name2";
	  params.header = "header 2";
	  params.footer = "footer 2";
	  fillGroupForm(params);
	  submitCreationGroup();
	  rerutnToGroupPage();
  }
  
  @Test
  public void tesEmptytRorPractic2() throws Exception {
	  openMainPage();
	  openGroupPage();
	  createNewGroup();
	  fillGroupForm(new DataForTest("", "", ""));
	  submitCreationGroup();
	  rerutnToGroupPage();
  }
}
