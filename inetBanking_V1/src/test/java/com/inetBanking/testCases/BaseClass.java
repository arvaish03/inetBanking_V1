package com.inetBanking.testCases;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass  {
	
	//ReadConfig readconfig= new ReadConfig();
	
	public String baseURL="http://demo.guru99.com/v3/index.php";
			//readconfig.getApplicationURL();
	public String username="mngr439458";
			//readconfig.getusername();
	public String password="bApedem";
			//readconfig.getpassword();
	public static WebDriver driver;
	//public static Logger logger;
	
	//@Parameters("browser")
	@BeforeClass
	public void setup()
	//String br)
	{
		
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");		
		/*readconfig.getchromepath());*/
		/*driver=new ChromeDriver();*/
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromedriver\\chromedriver_win32_v105\\chromedriver.exe");
		//System.getProperty("user.dir")+"//Drivers//firefox.exe");		
		/*readconfig.getchromepath());*/
		driver=new ChromeDriver();
		
		//logger= Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.properties");
		
		//if (br.equals("chrome")) {
		
		//}
		//else if (br.equals("firefox"))
	//	{
		//	System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			//driver=new FirefoxDriver();
		//}
		//driver.get(readconfig.getApplicationURL());
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
