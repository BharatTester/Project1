import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Edge.driver", "C:\\Edge");
		WebDriver driver= new EdgeDriver();
		driver.get("https://fw-sit.cloudinsurer.com/security-sso/login?service=https%3A%2F%2Ffw-sit.cloudinsurer.com%2Fmic%2Fpct#!CA-SUITE-HOME");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ompuser");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ompuser123");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//label[@for='cookieConsent']")).click();
        //driver.findElement(By.xpath("//span[@class='modalConsentContentClose']")).click();
        driver.findElement(By.cssSelector("#modalConsentHdrBtnOk")).click();
		driver.findElement(By.cssSelector("form[id='fm1'] span[class='v-button-wrap']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='Start New Customer_tour_id']//div[@class='v-gridlayout-slot']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		driver.findElement(By.id("field_key$233ee2b8-64bb-3baf-8dc9-504ae8c6aa9f$1display_customer_number-textbox")).sendKeys("3448768");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        driver.findElement(By.xpath("(//input[@id='field_key$5bb687d6-083f-369b-8936-ffa4667b3814$1c_first_name-textbox'])[1]")).sendKeys("Jack");
        

        driver.findElement(By.xpath("(//input[@id='field_key$c5027c7a-d517-30b6-b5f6-47422aaeaf73$1c_surname-textbox'])[1]")).sendKeys("Status");
        
	}

}
	