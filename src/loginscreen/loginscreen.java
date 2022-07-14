package loginscreen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginscreen {
	
	
	
	public static void main(String[] args) throws InterruptedException {

		loginpage();
		
	}
	
	public static void loginpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		try
		{
			driver.get("http://62.171.183.83:8080/QuaLISWeb/");
		}
		catch(Exception e)
		{
			
			System.out.println("Link is not valid");
		}
		
		
		
		WebElement username= driver.findElement(By.xpath("//*[@id=\"idEmail\"]"));
		username.sendKeys("limsadmin");
		
		WebElement password=driver.findElement(By.id("idpassword"));
		password.sendKeys("123");
		
		WebElement role=driver.findElement(By.id("idRole"));
		Select select= new Select(role);
		select.selectByIndex(0);
		
		WebElement submit=driver.findElement(By.id("idLogin"));
		submit.click();
		
		
		WebElement master=driver.findElement(By.id("MainMenu_1"));
		master.click();
		
		WebElement contacts1=driver.findElement(By.id("iModuleID_15"));
		contacts1.click();
		
		WebElement country=driver.findElement(By.id("iFormID_5"));
		country.click();
		
		WebElement actionmenu=driver.findElement(By.xpath("//*[@id='ID_BC_ActionMenu']/a"));
		actionmenu.click();
	
		WebElement countryadd=driver.findElement(By.id("ID_BC_CountryAddbutton"));
		/*Select select1= new Select(contactadd);
		select1.selectByIndex(0);*/
		countryadd.click();
		
		WebElement countryname=driver.findElement(By.id("ID_BC_CountryName"));
		countryname.sendKeys("India");
		
		WebElement countryabb=driver.findElement(By.id("ID_BC_Countryabb"));
		countryabb.sendKeys("IND");
		
		WebElement countrytwochar=driver.findElement(By.id("ID_BC_Countrytwochar"));
		countrytwochar.sendKeys("IN");
		
		WebElement countrythreechar=driver.findElement(By.id("ID_BC_Countrythreechr"));
		countrythreechar.sendKeys("IND");
		
		WebElement submitcountry=driver.findElement(By.id("ID_BC_countryADDSubmit"));
		submitcountry.click();
	}
	
	
	
}
