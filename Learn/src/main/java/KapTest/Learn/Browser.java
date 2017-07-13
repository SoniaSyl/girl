package KapTest.Learn;

public class Browser

{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//sys
		//ClassName obj = new ClassName();	
		//	FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();		
		//Maximize
		driver.manage().window().maximize();
		//Load d URL
		driver.get("http://leaftaps.com");


	}

}
